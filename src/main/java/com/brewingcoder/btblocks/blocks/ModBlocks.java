package com.brewingcoder.btblocks.blocks;

import com.brewingcoder.btblocks.BTBlocks;
import com.brewingcoder.btblocks.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BTBlocks.MODID);

    public static final RegistryObject<Block> ABYSSAL_STONE = register("abyssal_stone", ModBlocks::StoneBlock);
    public static final RegistryObject<Block> ABYSSAL_BRICKS = register("abyssal_bricks",ModBlocks::StoneBlock);
    public static final RegistryObject<Block> ABYSSAL_BRICKS_CRACKED = register("abyssal_bricks_cracked",ModBlocks::StoneBlock);
    public static final RegistryObject<Block> ABYSSAL_COBBLE = register("abyssal_cobblestone",ModBlocks::CobbleBlock);
    public static final RegistryObject<Block> ABYSSAL_SMOOTH = register("abyssal_smooth_stone",ModBlocks::SmoothBlock);

    public static final RegistryObject<Block> QUARRIED_STONE = register("quarried_stone", ModBlocks::StoneBlock);
    public static final RegistryObject<Block> QUARRIED_BRICKS = register("quarried_bricks",ModBlocks::StoneBlock);
    public static final RegistryObject<Block> QUARRIED_BRICKS_CRACKED = register("quarried_bricks_cracked",ModBlocks::StoneBlock);
    public static final RegistryObject<Block> QUARRIED_COBBLE = register("quarried_cobblestone",ModBlocks::CobbleBlock);
    public static final RegistryObject<Block> QUARRIED_SMOOTH = register("quarried_smooth_stone",ModBlocks::SmoothBlock);

    public static final RegistryObject<Block> BURNT_STONE = register("burnt_stone",ModBlocks::StoneBlock);


    public static final RegistryObject<StairBlock> ABYSSAL_STONE_STAIRS = register("abyssal_stone_stairs", ()-> MakeStairFromParent(ABYSSAL_STONE));
    public static final RegistryObject<StairBlock> ABYSSAL_BRICKS_STAIRS = register("abyssal_brick_stairs", ()-> MakeStairFromParent(ABYSSAL_BRICKS));
    public static final RegistryObject<StairBlock> ABYSSAL_BRICKS_CRACKED_STAIRS = register("abyssal_cracked_bricks_stairs",()-> MakeStairFromParent(ABYSSAL_BRICKS_CRACKED));
    public static final RegistryObject<StairBlock> ABYSSAL_COBBLE_STAIRS = register("abyssal_cobble_stairs", ()-> MakeStairFromParent(ABYSSAL_COBBLE));
    public static final RegistryObject<StairBlock> ABYSSAL_SMOOTH_STAIRS = register("abyssal_smooth_stairs", ()-> MakeStairFromParent(ABYSSAL_SMOOTH));

    public static final RegistryObject<StairBlock> QUARRIED_STONE_STAIRS = register("quarried_stone_stairs", ()-> MakeStairFromParent(QUARRIED_STONE));
    public static final RegistryObject<StairBlock> QUARRIED_BRICKS_STAIRS = register("quarried_brick_stairs", ()-> MakeStairFromParent(QUARRIED_BRICKS));
    public static final RegistryObject<StairBlock> QUARRIED_BRICKS_CRACKED_STAIRS = register("quarried_cracked_brick_stairs",()->MakeStairFromParent(QUARRIED_BRICKS_CRACKED));
    public static final RegistryObject<StairBlock> QUARRIED_COBBLE_STAIRS = register("quarried_cobble_stairs",()-> MakeStairFromParent(QUARRIED_COBBLE));
    public static final RegistryObject<StairBlock> QUARRIED_SMOOTH_STAIRS = register("quarried_smooth_stairs",()->MakeStairFromParent(QUARRIED_SMOOTH));

    public static final RegistryObject<SlabBlock> ABYSSAL_STONE_SLAB = register("abyssal_stone_slab",()->MakeSlabFromParent(ABYSSAL_STONE));
    public static final RegistryObject<SlabBlock> ABYSSAL_BRICKS_SLAB = register("abyssal_brick_slab",()->MakeSlabFromParent(ABYSSAL_BRICKS));
    public static final RegistryObject<SlabBlock> ABYSSAL_BRICKS_CRACKED_SLAB = register("abyssal_cracked_brick_slab",()->MakeSlabFromParent(ABYSSAL_BRICKS_CRACKED));
    public static final RegistryObject<SlabBlock> ABYSSAL_COBBLE_SLAB = register("abyssal_cobble_slab",()->MakeSlabFromParent(ABYSSAL_COBBLE));
    public static final RegistryObject<SlabBlock> ABYSSAL_SMOOTH_SLAB = register("abyssal_smooth_slab", ()->MakeSlabFromParent(ABYSSAL_SMOOTH));

    public static final RegistryObject<SlabBlock> QUARRIED_STONE_SLAB = register("quarried_stone_slab", ()->MakeSlabFromParent(QUARRIED_STONE));
    public static final RegistryObject<SlabBlock> QUARRIED_BRICKS_SLAB = register("quarried_brick_slab", ()->MakeSlabFromParent(QUARRIED_BRICKS));
    public static final RegistryObject<SlabBlock> QUARRIED_BRICKS_CRACKED_SLAB = register("quarried_cracked_brick_slab",()->MakeSlabFromParent(QUARRIED_BRICKS_CRACKED));
    public static final RegistryObject<SlabBlock> QUARRIED_COBBLE_SLAB = register("quarried_cobble_slab",()->MakeSlabFromParent(QUARRIED_COBBLE));
    public static final RegistryObject<SlabBlock> QUARRIED_SMOOTH_SLAB = register("quarried_smooth_slab", ()->MakeSlabFromParent(QUARRIED_SMOOTH));

    public static final RegistryObject<WallBlock> ABYSSAL_STONE_WALL = register("abyssal_stone_wall", ()->MakeWallFromParent(ABYSSAL_STONE));
    public static final RegistryObject<WallBlock> ABYSSAL_BRICKS_WALL = register("abyssal_brick_wall", ()->MakeWallFromParent(ABYSSAL_BRICKS));
    public static final RegistryObject<WallBlock> ABYSSAL_BRICKS_CRACKED_WALL = register("abyssal_cracked_brick_wall", ()->MakeWallFromParent(ABYSSAL_BRICKS_CRACKED));
    public static final RegistryObject<WallBlock> ABYSSAL_COBBLE_WALL = register("abyssal_cobble_wall", ()->MakeWallFromParent(ABYSSAL_COBBLE));
    public static final RegistryObject<WallBlock> ABYSSAL_SMOOTH_WALL = register("abyssal_smooth_wall", ()->MakeWallFromParent(ABYSSAL_SMOOTH));

    public static final RegistryObject<WallBlock> QUARRIED_STONE_WALL = register("quarried_stone_wall", ()->MakeWallFromParent(QUARRIED_STONE));
    public static final RegistryObject<WallBlock> QUARRIED_BRICKS_WALL = register("quarried_brick_wall", ()->MakeWallFromParent(QUARRIED_BRICKS));
    public static final RegistryObject<WallBlock> QUARRIED_BRICKS_CRACKED_WALL = register("quarried_cracked_brick_wall",()->MakeWallFromParent(QUARRIED_BRICKS_CRACKED));
    public static final RegistryObject<WallBlock> QUARRIED_COBBLE_WALL = register("quarried_cobble_wall",()->MakeWallFromParent(QUARRIED_COBBLE));
    public static final RegistryObject<WallBlock> QUARRIED_SMOOTH_WALL = register("quarried_smooth_wall", ()->MakeWallFromParent(QUARRIED_SMOOTH));


    private static WallBlock MakeWallFromParent(RegistryObject<? extends Block> parent){
        return new WallBlock(BlockBehaviour.Properties.copy(parent.get()));
    }
    private static StairBlock MakeStairFromParent(RegistryObject<? extends Block> parent){
        return new StairBlock(parent.get().defaultBlockState(),BlockBehaviour.Properties.copy(parent.get()));
    }
    private static SlabBlock MakeSlabFromParent(RegistryObject<? extends Block> parent){
        return new SlabBlock(BlockBehaviour.Properties.copy(parent.get()));
    }

    private static Block StoneBlock(){
        return new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops());
    }
    private static Block CobbleBlock(){
        return new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).requiresCorrectToolForDrops());
    }
    private static Block SmoothBlock(){
        return new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE).requiresCorrectToolForDrops());
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block){
        RegistryObject<T> registeredBlock = BLOCKS.register(name,block);
        ModItems.ITEMS.register(name, () -> new BlockItem(registeredBlock.get(), new Item.Properties()));
        return registeredBlock;
    }
}
