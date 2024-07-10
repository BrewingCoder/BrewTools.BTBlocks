package com.brewingcoder.btblocks.blocks;

import com.brewingcoder.btblocks.BTBlocks;
import com.brewingcoder.btblocks.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
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

    public static final RegistryObject<StairBlock> ABYSSAL_STONE_STAIRS = register("abyssal_stone_stairs", ()-> MakeStairFromParent(ABYSSAL_STONE));
    public static final RegistryObject<StairBlock> ABYSSAL_BRICKS_STAIRS = register("abyssal_brick_stairs", ()-> MakeStairFromParent(ABYSSAL_BRICKS));
    public static final RegistryObject<StairBlock> ABYSSAL_BRICKS_CRACKED_STAIRS = register("abyssal_cracked_bricks_stairs",()-> MakeStairFromParent(ABYSSAL_BRICKS_CRACKED));
    public static final RegistryObject<StairBlock> ABYSSAL_COBBLE_STAIRS = register("abyssal_cobble_stairs", ()-> MakeStairFromParent(ABYSSAL_COBBLE));
    public static final RegistryObject<StairBlock> ABYSSAL_SMOOTH_STAIRS = register("abyssal_smooth_stairs", ()-> MakeStairFromParent(ABYSSAL_SMOOTH));

    public static final RegistryObject<SlabBlock> ABYSSAL_STONE_SLAB = register("abyssal_stone_slab",()->MakeSlabFromParent(ABYSSAL_STONE));
    public static final RegistryObject<SlabBlock> ABYSSAL_BRICKS_SLAB = register("abyssal_brick_slab",()->MakeSlabFromParent(ABYSSAL_BRICKS));
    public static final RegistryObject<SlabBlock> ABYSSAL_BRICKS_CRACKED_SLAB = register("abyssal_cracked_brick_slab",()->MakeSlabFromParent(ABYSSAL_BRICKS_CRACKED));
    public static final RegistryObject<SlabBlock> ABYSSAL_COBBLE_SLAB = register("abyssal_cobble_slab",()->MakeSlabFromParent(ABYSSAL_COBBLE));
    public static final RegistryObject<SlabBlock> ABYSSAL_SMOOTH_SLAB = register("abyssal_smooth_slab", ()->MakeSlabFromParent(ABYSSAL_SMOOTH));

    public static final RegistryObject<WallBlock> ABYSSAL_STONE_WALL = register("abyssal_stone_wall", ()->MakeWallFromParent(ABYSSAL_STONE));
    public static final RegistryObject<WallBlock> ABYSSAL_BRICKS_WALL = register("abyssal_brick_wall", ()->MakeWallFromParent(ABYSSAL_BRICKS));
    public static final RegistryObject<WallBlock> ABYSSAL_BRICKS_CRACKED_WALL = register("abyssal_cracked_brick_wall", ()->MakeWallFromParent(ABYSSAL_BRICKS_CRACKED));
    public static final RegistryObject<WallBlock> ABYSSAL_COBBLE_WALL = register("abyssal_cobble_wall", ()->MakeWallFromParent(ABYSSAL_COBBLE));
    public static final RegistryObject<WallBlock> ABYSSAL_SMOOTH_WALL = register("abyssal_smooth_wall", ()->MakeWallFromParent(ABYSSAL_SMOOTH));

    public static final RegistryObject<FenceBlock> ABYSSAL_STONE_FENCE = register("abyssal_stone_fence",()->MakeFenceFromParent(ABYSSAL_STONE));
    public static final RegistryObject<FenceGateBlock> ABYSSAL_STONE_FENCE_GATE = register("abyssal_stone_fence_gate",()->MakeFenceGateFromParent(ABYSSAL_STONE));
    public static final RegistryObject<FenceBlock> ABYSSAL_BRICKS_FENCE = register("abyssal_bricks_fence",()->MakeFenceFromParent(ABYSSAL_BRICKS));
    public static final RegistryObject<FenceGateBlock> ABYSSAL_BRICKS_FENCE_GATE = register("abyssal_bricks_fence_gate",()->MakeFenceGateFromParent(ABYSSAL_BRICKS));
    public static final RegistryObject<FenceBlock> ABYSSAL_BRICKS_CRACKED_FENCE = register("abyssal_cracked_bricks_fence",()->MakeFenceFromParent(ABYSSAL_BRICKS_CRACKED));
    public static final RegistryObject<FenceGateBlock> ABYSSAL_BRICKS_CRACKED_FENCE_GATE = register("abyssal_cracked_bricks__fence_gate",()->MakeFenceGateFromParent(ABYSSAL_BRICKS_CRACKED));
    public static final RegistryObject<FenceBlock> ABYSSAL_COBBLE_FENCE = register("abyssal_cobble_fence",()->MakeFenceFromParent(ABYSSAL_COBBLE));
    public static final RegistryObject<FenceGateBlock> ABYSSAL_COBBLE_FENCE_GATE = register("abyssal_cobble_fence_gate",()->MakeFenceGateFromParent(ABYSSAL_COBBLE));
    public static final RegistryObject<FenceBlock> ABYSSAL_SMOOTH_FENCE = register("abyssal_smooth_fence",()->MakeFenceFromParent(ABYSSAL_STONE));
    public static final RegistryObject<FenceGateBlock> ABYSSAL_SMOOTH_FENCE_GATE = register("abyssal_smooth_fence_gate",()->MakeFenceGateFromParent(ABYSSAL_STONE));

    public static final RegistryObject<Block> QUARRIED_STONE = register("quarried_stone", ModBlocks::StoneBlock);
    public static final RegistryObject<Block> QUARRIED_BRICKS = register("quarried_bricks",ModBlocks::StoneBlock);
    public static final RegistryObject<Block> QUARRIED_BRICKS_CRACKED = register("quarried_bricks_cracked",ModBlocks::StoneBlock);
    public static final RegistryObject<Block> QUARRIED_COBBLE = register("quarried_cobblestone",ModBlocks::CobbleBlock);
    public static final RegistryObject<Block> QUARRIED_SMOOTH = register("quarried_smooth_stone",ModBlocks::SmoothBlock);

    public static final RegistryObject<StairBlock> QUARRIED_STONE_STAIRS = register("quarried_stone_stairs", ()-> MakeStairFromParent(QUARRIED_STONE));
    public static final RegistryObject<StairBlock> QUARRIED_BRICKS_STAIRS = register("quarried_brick_stairs", ()-> MakeStairFromParent(QUARRIED_BRICKS));
    public static final RegistryObject<StairBlock> QUARRIED_BRICKS_CRACKED_STAIRS = register("quarried_cracked_brick_stairs",()->MakeStairFromParent(QUARRIED_BRICKS_CRACKED));
    public static final RegistryObject<StairBlock> QUARRIED_COBBLE_STAIRS = register("quarried_cobble_stairs",()-> MakeStairFromParent(QUARRIED_COBBLE));
    public static final RegistryObject<StairBlock> QUARRIED_SMOOTH_STAIRS = register("quarried_smooth_stairs",()->MakeStairFromParent(QUARRIED_SMOOTH));

    public static final RegistryObject<SlabBlock> QUARRIED_STONE_SLAB = register("quarried_stone_slab", ()->MakeSlabFromParent(QUARRIED_STONE));
    public static final RegistryObject<SlabBlock> QUARRIED_BRICKS_SLAB = register("quarried_brick_slab", ()->MakeSlabFromParent(QUARRIED_BRICKS));
    public static final RegistryObject<SlabBlock> QUARRIED_BRICKS_CRACKED_SLAB = register("quarried_cracked_brick_slab",()->MakeSlabFromParent(QUARRIED_BRICKS_CRACKED));
    public static final RegistryObject<SlabBlock> QUARRIED_COBBLE_SLAB = register("quarried_cobble_slab",()->MakeSlabFromParent(QUARRIED_COBBLE));
    public static final RegistryObject<SlabBlock> QUARRIED_SMOOTH_SLAB = register("quarried_smooth_slab", ()->MakeSlabFromParent(QUARRIED_SMOOTH));
    
    public static final RegistryObject<WallBlock> QUARRIED_STONE_WALL = register("quarried_stone_wall", ()->MakeWallFromParent(QUARRIED_STONE));
    public static final RegistryObject<WallBlock> QUARRIED_BRICKS_WALL = register("quarried_brick_wall", ()->MakeWallFromParent(QUARRIED_BRICKS));
    public static final RegistryObject<WallBlock> QUARRIED_BRICKS_CRACKED_WALL = register("quarried_cracked_brick_wall",()->MakeWallFromParent(QUARRIED_BRICKS_CRACKED));
    public static final RegistryObject<WallBlock> QUARRIED_COBBLE_WALL = register("quarried_cobble_wall",()->MakeWallFromParent(QUARRIED_COBBLE));
    public static final RegistryObject<WallBlock> QUARRIED_SMOOTH_WALL = register("quarried_smooth_wall", ()->MakeWallFromParent(QUARRIED_SMOOTH));

    public static final RegistryObject<FenceBlock> QUARRIED_STONE_FENCE = register("quarried_stone_fence",()->MakeFenceFromParent(QUARRIED_STONE));
    public static final RegistryObject<FenceGateBlock> QUARRIED_STONE_FENCE_GATE = register("quarried_stone_fence_gate",()->MakeFenceGateFromParent(QUARRIED_STONE));
    public static final RegistryObject<FenceBlock> QUARRIED_BRICKS_FENCE = register("quarried_bricks_fence",()->MakeFenceFromParent(QUARRIED_BRICKS));
    public static final RegistryObject<FenceGateBlock> QUARRIED_BRICKS_FENCE_GATE = register("quarried_bricks_fence_gate",()->MakeFenceGateFromParent(QUARRIED_BRICKS));
    public static final RegistryObject<FenceBlock> QUARRIED_BRICKS_CRACKED_FENCE = register("quarried_cracked_bricks_fence",()->MakeFenceFromParent(QUARRIED_BRICKS_CRACKED));
    public static final RegistryObject<FenceGateBlock> QUARRIED_BRICKS_CRACKED_FENCE_GATE = register("quarried_cracked_bricks__fence_gate",()->MakeFenceGateFromParent(QUARRIED_BRICKS_CRACKED));
    public static final RegistryObject<FenceBlock> QUARRIED_COBBLE_FENCE = register("quarried_cobble_fence",()->MakeFenceFromParent(QUARRIED_COBBLE));
    public static final RegistryObject<FenceGateBlock> QUARRIED_COBBLE_FENCE_GATE = register("quarried_cobble_fence_gate",()->MakeFenceGateFromParent(QUARRIED_COBBLE));
    public static final RegistryObject<FenceBlock> QUARRIED_SMOOTH_FENCE = register("quarried_smooth_fence",()->MakeFenceFromParent(QUARRIED_STONE));
    public static final RegistryObject<FenceGateBlock> QUARRIED_SMOOTH_FENCE_GATE = register("quarried_smooth_fence_gate",()->MakeFenceGateFromParent(QUARRIED_STONE));

    public static final RegistryObject<Block> BURNT_STONE = register("burnt_stone",ModBlocks::StoneBlock);
    public static final RegistryObject<Block> BURNT_BRICKS = register("burnt_bricks",ModBlocks::StoneBlock);
    public static final RegistryObject<Block> BURNT_BRICKS_CRACKED = register("burnt_bricks_cracked",ModBlocks::StoneBlock);
    public static final RegistryObject<Block> BURNT_COBBLE = register("burnt_cobblestone",ModBlocks::CobbleBlock);
    public static final RegistryObject<Block> BURNT_SMOOTH = register("burnt_smooth_stone",ModBlocks::SmoothBlock);

    public static final RegistryObject<StairBlock> BURNT_STONE_STAIRS = register("burnt_stone_stairs",()->MakeStairFromParent(BURNT_STONE));
    public static final RegistryObject<StairBlock> BURNT_BRICKS_STAIRS = register("burnt_brick_stairs", ()->MakeStairFromParent(BURNT_BRICKS));
    public static final RegistryObject<StairBlock> BURNT_BRICKS_CRACKED_STAIRS = register("burnt_cracked_brick_stairs",()->MakeStairFromParent(BURNT_BRICKS_CRACKED));
    public static final RegistryObject<StairBlock> BURNT_COBBLE_STAIRS = register("burnt_cobble_stairs",()->MakeStairFromParent(BURNT_COBBLE));
    public static final RegistryObject<StairBlock> BURNT_SMOOTH_STAIRS = register("burnt_smooth_stairs",()->MakeStairFromParent(BURNT_SMOOTH));

    public static final RegistryObject<SlabBlock> BURNT_STONE_SLAB = register("burnt_stone_slab",()->MakeSlabFromParent(BURNT_STONE));
    public static final RegistryObject<SlabBlock> BURNT_BRICK_SLAB = register("burnt_brick_slab", ()->MakeSlabFromParent(BURNT_BRICKS));
    public static final RegistryObject<SlabBlock> BURNT_BRICK_CRACKED_SLAB = register("burnt_cracked_brick_slab",()->MakeSlabFromParent(BURNT_BRICKS_CRACKED));
    public static final RegistryObject<SlabBlock> BURNT_COBBLE_SLAB = register("burnt_cobble_slab",()->MakeSlabFromParent(BURNT_COBBLE));
    public static final RegistryObject<SlabBlock> BURNT_SMOOTH_SLAB = register("burnt_smooth_slab",()->MakeSlabFromParent(BURNT_SMOOTH));

    public static final RegistryObject<WallBlock> BURNT_STONE_WALL = register("burnt_stone_wall",()->MakeWallFromParent(BURNT_STONE));
    public static final RegistryObject<WallBlock> BURNT_BRICKS_WALL = register("burnt_brick_wall",()->MakeWallFromParent(BURNT_BRICKS));
    public static final RegistryObject<WallBlock> BURNT_BRICKS_CRACKED_WALL = register("burnt_cracked_brick_wall",()->MakeWallFromParent(BURNT_BRICKS_CRACKED));
    public static final RegistryObject<WallBlock> BURNT_COBBLE_WALL = register("burnt_cobble_wall",()->MakeWallFromParent(BURNT_COBBLE));
    public static final RegistryObject<WallBlock> BURNT_SMOOTH_WALL = register("burnt_smooth_wall",()->MakeWallFromParent(BURNT_SMOOTH));

    public static final RegistryObject<FenceBlock> BURNT_STONE_FENCE = register("burnt_stone_fence",()->MakeFenceFromParent(BURNT_STONE));
    public static final RegistryObject<FenceGateBlock> BURNT_STONE_FENCE_GATE = register("burnt_stone_fence_gate",()->MakeFenceGateFromParent(BURNT_STONE));
    public static final RegistryObject<FenceBlock> BURNT_BRICKS_FENCE = register("burnt_bricks_fence",()->MakeFenceFromParent(BURNT_BRICKS));
    public static final RegistryObject<FenceGateBlock> BURNT_BRICKS_FENCE_GATE = register("burnt_bricks_fence_gate",()->MakeFenceGateFromParent(BURNT_BRICKS));
    public static final RegistryObject<FenceBlock> BURNT_BRICKS_CRACKED_FENCE = register("burnt_cracked_bricks_fence",()->MakeFenceFromParent(BURNT_BRICKS_CRACKED));
    public static final RegistryObject<FenceGateBlock> BURNT_BRICKS_CRACKED_FENCE_GATE = register("burnt_cracked_bricks__fence_gate",()->MakeFenceGateFromParent(BURNT_BRICKS_CRACKED));
    public static final RegistryObject<FenceBlock> BURNT_COBBLE_FENCE = register("burnt_cobble_fence",()->MakeFenceFromParent(BURNT_COBBLE));
    public static final RegistryObject<FenceGateBlock> BURNT_COBBLE_FENCE_GATE = register("burnt_cobble_fence_gate",()->MakeFenceGateFromParent(BURNT_COBBLE));
    public static final RegistryObject<FenceBlock> BURNT_SMOOTH_FENCE = register("burnt_smooth_fence",()->MakeFenceFromParent(BURNT_STONE));
    public static final RegistryObject<FenceGateBlock> BURNT_SMOOTH_FENCE_GATE = register("burnt_smooth_fence_gate",()->MakeFenceGateFromParent(BURNT_STONE));

    public static final RegistryObject<Block> FOREST_STONE = register("forest_stone", ModBlocks::StoneBlock);
    public static final RegistryObject<Block> FOREST_BRICKS = register("forest_bricks", ModBlocks::StoneBlock);
    public static final RegistryObject<Block> FOREST_BRICKS_CRACKED = register("forest_bricks_cracked", ModBlocks::StoneBlock);
    public static final RegistryObject<Block> FOREST_COBBLE = register("forest_cobblestone", ModBlocks::CobbleBlock);
    public static final RegistryObject<Block> FOREST_SMOOTH = register("forest_smooth_stone", ModBlocks::SmoothBlock);

    public static final RegistryObject<StairBlock> FOREST_STONE_STAIRS = register("forest_stone_stairs",()->MakeStairFromParent(FOREST_STONE));
    public static final RegistryObject<StairBlock> FOREST_BRICKS_STAIRS = register("forest_brick_stairs", ()->MakeStairFromParent(FOREST_BRICKS));
    public static final RegistryObject<StairBlock> FOREST_BRICKS_CRACKED_STAIRS = register("forest_cracked_brick_stairs",()->MakeStairFromParent(FOREST_BRICKS_CRACKED));
    public static final RegistryObject<StairBlock> FOREST_COBBLE_STAIRS = register("forest_cobble_stairs",()->MakeStairFromParent(FOREST_COBBLE));
    public static final RegistryObject<StairBlock> FOREST_SMOOTH_STAIRS = register("forest_smooth_stairs",()->MakeStairFromParent(FOREST_SMOOTH));

    public static final RegistryObject<SlabBlock> FOREST_STONE_SLAB = register("forest_stone_slab",()->MakeSlabFromParent(FOREST_STONE));
    public static final RegistryObject<SlabBlock> FOREST_BRICK_SLAB = register("forest_brick_slab", ()->MakeSlabFromParent(FOREST_BRICKS));
    public static final RegistryObject<SlabBlock> FOREST_BRICK_CRACKED_SLAB = register("forest_cracked_brick_slab",()->MakeSlabFromParent(FOREST_BRICKS_CRACKED));
    public static final RegistryObject<SlabBlock> FOREST_COBBLE_SLAB = register("forest_cobble_slab",()->MakeSlabFromParent(FOREST_COBBLE));
    public static final RegistryObject<SlabBlock> FOREST_SMOOTH_SLAB = register("forest_smooth_slab",()->MakeSlabFromParent(FOREST_SMOOTH));

    public static final RegistryObject<WallBlock> FOREST_STONE_WALL = register("forest_stone_wall",()->MakeWallFromParent(FOREST_STONE));
    public static final RegistryObject<WallBlock> FOREST_BRICKS_WALL = register("forest_brick_wall",()->MakeWallFromParent(FOREST_BRICKS));
    public static final RegistryObject<WallBlock> FOREST_BRICKS_CRACKED_WALL = register("forest_cracked_brick_wall",()->MakeWallFromParent(FOREST_BRICKS_CRACKED));
    public static final RegistryObject<WallBlock> FOREST_COBBLE_WALL = register("forest_cobble_wall",()->MakeWallFromParent(FOREST_COBBLE));
    public static final RegistryObject<WallBlock> FOREST_SMOOTH_WALL = register("forest_smooth_wall",()->MakeWallFromParent(FOREST_SMOOTH));

    public static final RegistryObject<FenceBlock> FOREST_STONE_FENCE = register("forest_stone_fence",()->MakeFenceFromParent(FOREST_STONE));
    public static final RegistryObject<FenceGateBlock> FOREST_STONE_FENCE_GATE = register("forest_stone_fence_gate",()->MakeFenceGateFromParent(FOREST_STONE));
    public static final RegistryObject<FenceBlock> FOREST_BRICKS_FENCE = register("forest_bricks_fence",()->MakeFenceFromParent(FOREST_BRICKS));
    public static final RegistryObject<FenceGateBlock> FOREST_BRICKS_FENCE_GATE = register("forest_bricks_fence_gate",()->MakeFenceGateFromParent(FOREST_BRICKS));
    public static final RegistryObject<FenceBlock> FOREST_BRICKS_CRACKED_FENCE = register("forest_cracked_bricks_fence",()->MakeFenceFromParent(FOREST_BRICKS_CRACKED));
    public static final RegistryObject<FenceGateBlock> FOREST_BRICKS_CRACKED_FENCE_GATE = register("forest_cracked_bricks__fence_gate",()->MakeFenceGateFromParent(FOREST_BRICKS_CRACKED));
    public static final RegistryObject<FenceBlock> FOREST_COBBLE_FENCE = register("forest_cobble_fence",()->MakeFenceFromParent(FOREST_COBBLE));
    public static final RegistryObject<FenceGateBlock> FOREST_COBBLE_FENCE_GATE = register("forest_cobble_fence_gate",()->MakeFenceGateFromParent(FOREST_COBBLE));
    public static final RegistryObject<FenceBlock> FOREST_SMOOTH_FENCE = register("forest_smooth_fence",()->MakeFenceFromParent(FOREST_STONE));
    public static final RegistryObject<FenceGateBlock> FOREST_SMOOTH_FENCE_GATE = register("forest_smooth_fence_gate",()->MakeFenceGateFromParent(FOREST_STONE));




    private static FenceBlock MakeFenceFromParent(RegistryObject<Block> parent){
        return new FenceBlock(BlockBehaviour.Properties.copy(parent.get()));
    }

    private static FenceGateBlock MakeFenceGateFromParent(RegistryObject<Block> parent){
        return new FenceGateBlock(BlockBehaviour.Properties.copy(parent.get()),WoodType.OAK);
    }


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
