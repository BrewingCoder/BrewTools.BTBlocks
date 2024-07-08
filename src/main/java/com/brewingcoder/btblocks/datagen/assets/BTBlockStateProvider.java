package com.brewingcoder.btblocks.datagen.assets;

import com.brewingcoder.btblocks.BTBlocks;
import com.brewingcoder.btblocks.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
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

    }


    private void makeWall(RegistryObject<? extends WallBlock> wb, RegistryObject<? extends Block> parent){
        ResourceLocation loc = modLoc("block/" + parent.getId().getPath());
        wallBlock(wb.get(),loc);
        models().wallInventory(wb.getId().getPath() + "_inventory",loc);

    }


    private void makeSlab(RegistryObject<? extends SlabBlock> sb, RegistryObject<? extends Block> parent){
        slabBlock(sb.get(),modLoc("block/" + parent.getId().getPath()),modLoc("block/" + parent.getId().getPath()));
    }

    private void makeStairs(RegistryObject<? extends StairBlock> sb, RegistryObject<? extends Block> parent){
        stairsBlock(sb.get(),modLoc("block/" + parent.getId().getPath()));
    }

    private void blockWithItem(RegistryObject<? extends Block> block){
        simpleBlockWithItem(block.get(),cubeAll(block.get()));
    }
}

