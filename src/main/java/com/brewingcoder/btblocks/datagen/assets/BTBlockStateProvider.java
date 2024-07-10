package com.brewingcoder.btblocks.datagen.assets;

import com.brewingcoder.btblocks.BTBlocks;
import com.brewingcoder.btblocks.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BTBlockStateProvider extends BlockStateProvider {

    public BTBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BTBlocks.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ABYSSAL_STONE);
        blockWithItem(ModBlocks.ABYSSAL_COBBLE);
        blockWithItem(ModBlocks.ABYSSAL_BRICKS);
        blockWithItem(ModBlocks.ABYSSAL_SMOOTH);
        blockWithItem(ModBlocks.ABYSSAL_BRICKS_CRACKED);

        blockWithItem(ModBlocks.QUARRIED_STONE);
        blockWithItem(ModBlocks.QUARRIED_COBBLE);
        blockWithItem(ModBlocks.QUARRIED_BRICKS);
        blockWithItem(ModBlocks.QUARRIED_SMOOTH);
        blockWithItem(ModBlocks.QUARRIED_BRICKS_CRACKED);
        blockWithItem(ModBlocks.BURNT_STONE);
        blockWithItem(ModBlocks.BURNT_BRICKS);
        blockWithItem(ModBlocks.BURNT_BRICKS_CRACKED);
        blockWithItem(ModBlocks.BURNT_COBBLE);
        blockWithItem(ModBlocks.BURNT_SMOOTH);
        blockWithItem(ModBlocks.FOREST_STONE);
        blockWithItem(ModBlocks.FOREST_BRICKS);
        blockWithItem(ModBlocks.FOREST_BRICKS_CRACKED);
        blockWithItem(ModBlocks.FOREST_COBBLE);
        blockWithItem(ModBlocks.FOREST_SMOOTH);


        makeStairs(ModBlocks.ABYSSAL_STONE_STAIRS,ModBlocks.ABYSSAL_STONE);
        makeStairs(ModBlocks.ABYSSAL_BRICKS_STAIRS,ModBlocks.ABYSSAL_BRICKS);
        makeStairs(ModBlocks.ABYSSAL_BRICKS_CRACKED_STAIRS, ModBlocks.ABYSSAL_BRICKS_CRACKED);
        makeStairs(ModBlocks.ABYSSAL_COBBLE_STAIRS, ModBlocks.ABYSSAL_COBBLE);
        makeStairs(ModBlocks.ABYSSAL_SMOOTH_STAIRS, ModBlocks.ABYSSAL_SMOOTH);

        makeStairs(ModBlocks.QUARRIED_STONE_STAIRS,ModBlocks.QUARRIED_STONE);
        makeStairs(ModBlocks.QUARRIED_BRICKS_STAIRS,ModBlocks.QUARRIED_BRICKS);
        makeStairs(ModBlocks.QUARRIED_BRICKS_CRACKED_STAIRS, ModBlocks.QUARRIED_BRICKS_CRACKED);
        makeStairs(ModBlocks.QUARRIED_COBBLE_STAIRS, ModBlocks.QUARRIED_COBBLE);
        makeStairs(ModBlocks.QUARRIED_SMOOTH_STAIRS, ModBlocks.QUARRIED_SMOOTH);

        makeStairs(ModBlocks.BURNT_STONE_STAIRS, ModBlocks.BURNT_STONE);
        makeStairs(ModBlocks.BURNT_BRICKS_STAIRS, ModBlocks.BURNT_BRICKS);
        makeStairs(ModBlocks.BURNT_BRICKS_CRACKED_STAIRS, ModBlocks.BURNT_BRICKS_CRACKED);
        makeStairs(ModBlocks.BURNT_COBBLE_STAIRS, ModBlocks.BURNT_COBBLE);
        makeStairs(ModBlocks.BURNT_SMOOTH_STAIRS, ModBlocks.BURNT_SMOOTH);

        makeSlab(ModBlocks.ABYSSAL_STONE_SLAB, ModBlocks.ABYSSAL_STONE);
        makeSlab(ModBlocks.ABYSSAL_BRICKS_SLAB, ModBlocks.ABYSSAL_BRICKS);
        makeSlab(ModBlocks.ABYSSAL_BRICKS_CRACKED_SLAB, ModBlocks.ABYSSAL_BRICKS_CRACKED);
        makeSlab(ModBlocks.ABYSSAL_COBBLE_SLAB, ModBlocks.ABYSSAL_COBBLE);
        makeSlab(ModBlocks.ABYSSAL_SMOOTH_SLAB,ModBlocks.ABYSSAL_SMOOTH);

        makeSlab(ModBlocks.QUARRIED_STONE_SLAB, ModBlocks.QUARRIED_STONE);
        makeSlab(ModBlocks.QUARRIED_BRICKS_SLAB, ModBlocks.QUARRIED_BRICKS);
        makeSlab(ModBlocks.QUARRIED_BRICKS_CRACKED_SLAB, ModBlocks.QUARRIED_BRICKS_CRACKED);
        makeSlab(ModBlocks.QUARRIED_COBBLE_SLAB, ModBlocks.QUARRIED_COBBLE);
        makeSlab(ModBlocks.QUARRIED_SMOOTH_SLAB, ModBlocks.QUARRIED_SMOOTH);

        makeSlab(ModBlocks.BURNT_STONE_SLAB, ModBlocks.BURNT_STONE);
        makeSlab(ModBlocks.BURNT_BRICK_SLAB, ModBlocks.BURNT_BRICKS);
        makeSlab(ModBlocks.BURNT_BRICK_CRACKED_SLAB, ModBlocks.BURNT_BRICKS_CRACKED);
        makeSlab(ModBlocks.BURNT_COBBLE_SLAB, ModBlocks.BURNT_COBBLE);
        makeSlab(ModBlocks.BURNT_SMOOTH_SLAB, ModBlocks.BURNT_SMOOTH);

        makeWall(ModBlocks.ABYSSAL_STONE_WALL, ModBlocks.ABYSSAL_STONE);
        makeWall(ModBlocks.ABYSSAL_BRICKS_WALL, ModBlocks.ABYSSAL_BRICKS);
        makeWall(ModBlocks.ABYSSAL_BRICKS_CRACKED_WALL, ModBlocks.ABYSSAL_BRICKS_CRACKED);
        makeWall(ModBlocks.ABYSSAL_COBBLE_WALL, ModBlocks.ABYSSAL_COBBLE);
        makeWall(ModBlocks.ABYSSAL_SMOOTH_WALL, ModBlocks.ABYSSAL_SMOOTH);

        makeWall(ModBlocks.QUARRIED_STONE_WALL, ModBlocks.QUARRIED_STONE);
        makeWall(ModBlocks.QUARRIED_BRICKS_WALL, ModBlocks.QUARRIED_BRICKS);
        makeWall(ModBlocks.QUARRIED_BRICKS_CRACKED_WALL, ModBlocks.QUARRIED_BRICKS_CRACKED);
        makeWall(ModBlocks.QUARRIED_COBBLE_WALL, ModBlocks.QUARRIED_COBBLE);
        makeWall(ModBlocks.QUARRIED_SMOOTH_WALL, ModBlocks.QUARRIED_SMOOTH);

        makeWall(ModBlocks.BURNT_STONE_WALL, ModBlocks.BURNT_STONE);
        makeWall(ModBlocks.BURNT_BRICKS_WALL, ModBlocks.BURNT_BRICKS);
        makeWall(ModBlocks.BURNT_BRICKS_CRACKED_WALL, ModBlocks.BURNT_BRICKS_CRACKED);
        makeWall(ModBlocks.BURNT_COBBLE_WALL, ModBlocks.BURNT_COBBLE);
        makeWall(ModBlocks.BURNT_SMOOTH_WALL, ModBlocks.BURNT_SMOOTH);

        makeSlab(ModBlocks.FOREST_STONE_SLAB, ModBlocks.FOREST_STONE);
        makeSlab(ModBlocks.FOREST_BRICK_SLAB, ModBlocks.FOREST_BRICKS);
        makeSlab(ModBlocks.FOREST_BRICK_CRACKED_SLAB, ModBlocks.FOREST_BRICKS_CRACKED);
        makeSlab(ModBlocks.FOREST_COBBLE_SLAB, ModBlocks.FOREST_COBBLE);
        makeSlab(ModBlocks.FOREST_SMOOTH_SLAB, ModBlocks.FOREST_SMOOTH);

        makeWall(ModBlocks.FOREST_STONE_WALL, ModBlocks.FOREST_STONE);
        makeWall(ModBlocks.FOREST_BRICKS_WALL, ModBlocks.FOREST_BRICKS);
        makeWall(ModBlocks.FOREST_BRICKS_CRACKED_WALL, ModBlocks.FOREST_BRICKS_CRACKED);
        makeWall(ModBlocks.FOREST_COBBLE_WALL, ModBlocks.FOREST_COBBLE);
        makeWall(ModBlocks.FOREST_SMOOTH_WALL, ModBlocks.FOREST_SMOOTH);

        makeStairs(ModBlocks.FOREST_STONE_STAIRS, ModBlocks.FOREST_STONE);
        makeStairs(ModBlocks.FOREST_BRICKS_STAIRS, ModBlocks.FOREST_BRICKS);
        makeStairs(ModBlocks.FOREST_BRICKS_CRACKED_STAIRS, ModBlocks.FOREST_BRICKS_CRACKED);
        makeStairs(ModBlocks.FOREST_COBBLE_STAIRS, ModBlocks.FOREST_COBBLE);
        makeStairs(ModBlocks.FOREST_SMOOTH_STAIRS, ModBlocks.FOREST_SMOOTH);

        makeFence(ModBlocks.ABYSSAL_STONE_FENCE, ModBlocks.ABYSSAL_STONE);
        makeFenceGate(ModBlocks.ABYSSAL_STONE_FENCE_GATE, ModBlocks.ABYSSAL_STONE);
        makeFence(ModBlocks.ABYSSAL_BRICKS_FENCE, ModBlocks.ABYSSAL_BRICKS);
        makeFenceGate(ModBlocks.ABYSSAL_BRICKS_FENCE_GATE, ModBlocks.ABYSSAL_BRICKS);
        makeFence(ModBlocks.ABYSSAL_BRICKS_CRACKED_FENCE, ModBlocks.ABYSSAL_BRICKS_CRACKED);
        makeFenceGate(ModBlocks.ABYSSAL_BRICKS_CRACKED_FENCE_GATE, ModBlocks.ABYSSAL_BRICKS_CRACKED);
        makeFence(ModBlocks.ABYSSAL_COBBLE_FENCE, ModBlocks.ABYSSAL_COBBLE);
        makeFenceGate(ModBlocks.ABYSSAL_COBBLE_FENCE_GATE, ModBlocks.ABYSSAL_COBBLE);
        makeFence(ModBlocks.ABYSSAL_SMOOTH_FENCE, ModBlocks.ABYSSAL_SMOOTH);
        makeFenceGate(ModBlocks.ABYSSAL_SMOOTH_FENCE_GATE, ModBlocks.ABYSSAL_SMOOTH);

        makeFence(ModBlocks.QUARRIED_STONE_FENCE, ModBlocks.QUARRIED_STONE);
        makeFenceGate(ModBlocks.QUARRIED_STONE_FENCE_GATE, ModBlocks.QUARRIED_STONE);
        makeFence(ModBlocks.QUARRIED_BRICKS_FENCE, ModBlocks.QUARRIED_BRICKS);
        makeFenceGate(ModBlocks.QUARRIED_BRICKS_FENCE_GATE, ModBlocks.QUARRIED_BRICKS);
        makeFence(ModBlocks.QUARRIED_BRICKS_CRACKED_FENCE, ModBlocks.QUARRIED_BRICKS_CRACKED);
        makeFenceGate(ModBlocks.QUARRIED_BRICKS_CRACKED_FENCE_GATE, ModBlocks.QUARRIED_BRICKS_CRACKED);
        makeFence(ModBlocks.QUARRIED_COBBLE_FENCE, ModBlocks.QUARRIED_COBBLE);
        makeFenceGate(ModBlocks.QUARRIED_COBBLE_FENCE_GATE, ModBlocks.QUARRIED_COBBLE);
        makeFence(ModBlocks.QUARRIED_SMOOTH_FENCE, ModBlocks.QUARRIED_SMOOTH);
        makeFenceGate(ModBlocks.QUARRIED_SMOOTH_FENCE_GATE, ModBlocks.QUARRIED_SMOOTH);

        makeFence(ModBlocks.BURNT_STONE_FENCE, ModBlocks.BURNT_STONE);
        makeFenceGate(ModBlocks.BURNT_STONE_FENCE_GATE, ModBlocks.BURNT_STONE);
        makeFence(ModBlocks.BURNT_BRICKS_FENCE, ModBlocks.BURNT_BRICKS);
        makeFenceGate(ModBlocks.BURNT_BRICKS_FENCE_GATE, ModBlocks.BURNT_BRICKS);
        makeFence(ModBlocks.BURNT_BRICKS_CRACKED_FENCE, ModBlocks.BURNT_BRICKS_CRACKED);
        makeFenceGate(ModBlocks.BURNT_BRICKS_CRACKED_FENCE_GATE, ModBlocks.BURNT_BRICKS_CRACKED);
        makeFence(ModBlocks.BURNT_COBBLE_FENCE, ModBlocks.BURNT_COBBLE);
        makeFenceGate(ModBlocks.BURNT_COBBLE_FENCE_GATE, ModBlocks.BURNT_COBBLE);
        makeFence(ModBlocks.BURNT_SMOOTH_FENCE, ModBlocks.BURNT_SMOOTH);
        makeFenceGate(ModBlocks.BURNT_SMOOTH_FENCE_GATE, ModBlocks.BURNT_SMOOTH);

        makeFence(ModBlocks.FOREST_STONE_FENCE, ModBlocks.FOREST_STONE);
        makeFenceGate(ModBlocks.FOREST_STONE_FENCE_GATE, ModBlocks.FOREST_STONE);
        makeFence(ModBlocks.FOREST_BRICKS_FENCE, ModBlocks.FOREST_BRICKS);
        makeFenceGate(ModBlocks.FOREST_BRICKS_FENCE_GATE, ModBlocks.FOREST_BRICKS);
        makeFence(ModBlocks.FOREST_BRICKS_CRACKED_FENCE, ModBlocks.FOREST_BRICKS_CRACKED);
        makeFenceGate(ModBlocks.FOREST_BRICKS_CRACKED_FENCE_GATE, ModBlocks.FOREST_BRICKS_CRACKED);
        makeFence(ModBlocks.FOREST_COBBLE_FENCE, ModBlocks.FOREST_COBBLE);
        makeFenceGate(ModBlocks.FOREST_COBBLE_FENCE_GATE, ModBlocks.FOREST_COBBLE);
        makeFence(ModBlocks.FOREST_SMOOTH_FENCE, ModBlocks.FOREST_SMOOTH);
        makeFenceGate(ModBlocks.FOREST_SMOOTH_FENCE_GATE, ModBlocks.FOREST_SMOOTH);

    }

    private void makeFence(RegistryObject<FenceBlock> fb, RegistryObject<Block> parent){
        ResourceLocation loc = modLoc("block/" + parent.getId().getPath());
        fenceBlock(fb.get(),loc);
        models().fenceInventory(fb.getId().getPath() + "_inventory",loc);
    }

    private void makeFenceGate(RegistryObject<FenceGateBlock> fg, RegistryObject<Block> parent){
        ResourceLocation loc = modLoc("block/" + parent.getId().getPath());
        fenceGateBlock(fg.get(),loc);
        models().fenceInventory(fg.getId().getPath() + "_inventory",loc);
    }

    private void makeWall(RegistryObject<WallBlock> wb, RegistryObject<Block> parent){
        ResourceLocation loc = modLoc("block/" + parent.getId().getPath());
        wallBlock(wb.get(),loc);
        models().wallInventory(wb.getId().getPath() + "_inventory",loc);

    }


    private void makeSlab(RegistryObject<SlabBlock> sb, RegistryObject<Block> parent){
        slabBlock(sb.get(),modLoc("block/" + parent.getId().getPath()),modLoc("block/" + parent.getId().getPath()));
    }

    private void makeStairs(RegistryObject<StairBlock> sb, RegistryObject<Block> parent){
        stairsBlock(sb.get(),modLoc("block/" + parent.getId().getPath()));
    }

    private void blockWithItem(RegistryObject<? extends Block> block){
        simpleBlockWithItem(block.get(),cubeAll(block.get()));
    }
    private void blockWithItem(RegistryObject<? extends Block> block, RegistryObject<? extends Block> parent){
        simpleBlockWithItem(block.get(),cubeAll(parent.get()));
    }
}

