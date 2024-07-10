package com.brewingcoder.btblocks;

import com.brewingcoder.btblocks.blocks.ModBlocks;
import com.brewingcoder.btblocks.datagen.assets.*;
import com.brewingcoder.btblocks.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod(BTBlocks.MODID)
public class BTBlocks
{
    public static final String MODID = "btblocks";
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .title(Component.literal("BrewTools Blocks"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModBlocks.ABYSSAL_STONE.get().asItem().getDefaultInstance())
            .displayItems((parameters, output) ->
                    ModBlocks.BLOCKS
                            .getEntries()
                            .forEach(block->output.accept(block.get())))
            .build());

    public BTBlocks()
    {
        IEventBus BUS = FMLJavaModLoadingContext.get().getModEventBus();
        BUS.addListener(this::commonSetup);
        ModBlocks.BLOCKS.register(BUS);
        ModItems.ITEMS.register(BUS);

        BUS.addListener(this::generateData);

        CREATIVE_MODE_TABS.register(BUS);
        MinecraftForge.EVENT_BUS.register(this);
        BUS.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
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

}
