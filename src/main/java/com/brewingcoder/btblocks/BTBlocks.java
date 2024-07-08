package com.brewingcoder.btblocks;

import com.brewingcoder.btblocks.blocks.ModBlocks;
import com.brewingcoder.btblocks.datagen.assets.*;
import com.brewingcoder.btblocks.items.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod(BTBlocks.MODID)
public class BTBlocks
{
    public static final String MODID = "btblocks";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);



    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModBlocks.ABYSSAL_STONE.get().asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                ModBlocks.BLOCKS.getEntries().forEach(block->output.accept(block.get()));
            }).build());

    public BTBlocks()
    {
        IEventBus BUS = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        BUS.addListener(this::commonSetup);
        ModBlocks.BLOCKS.register(BUS);
        ModItems.ITEMS.register(BUS);

        BUS.addListener(this::generateData);

        CREATIVE_MODE_TABS.register(BUS);
        MinecraftForge.EVENT_BUS.register(this);
        BUS.addListener(this::addCreative);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.ABYSSAL_STONE.get());
            event.accept(ModBlocks.ABYSSAL_BRICKS.get());
            event.accept(ModBlocks.ABYSSAL_COBBLE.get());
            event.accept(ModBlocks.ABYSSAL_SMOOTH.get());
            event.accept(ModBlocks.QUARRIED_STONE.get());
        }
    }

    private void generateData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new ENLanguageProvider(output));
        generator.addProvider(event.includeClient(), new BTBlockModelProvider(output,helper));
        generator.addProvider(event.includeClient(), new BTBlockStateProvider(output, helper));
        generator.addProvider(event.includeClient(), new BTItemModelProvider(output,helper));

        BTBlockTagsProvider blockTags = new BTBlockTagsProvider(output, event.getLookupProvider(), helper);
        generator.addProvider(event.includeServer(), blockTags);

        generator.addProvider(event.includeServer(),new BTLootTableProvider(output));
        generator.addProvider(event.includeServer(), new BTRecipeProvider(output));

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
