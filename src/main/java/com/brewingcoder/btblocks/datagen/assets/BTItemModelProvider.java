package com.brewingcoder.btblocks.datagen.assets;

import com.brewingcoder.btblocks.BTBlocks;
import com.brewingcoder.btblocks.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;


public class BTItemModelProvider extends ItemModelProvider {
    public BTItemModelProvider(PackOutput output, ExistingFileHelper helper){
        super(output, BTBlocks.MODID,helper);
    }

    @Override
    protected void registerModels() {
        BlockModel(ModBlocks.ABYSSAL_STONE_STAIRS);
        BlockModel(ModBlocks.ABYSSAL_BRICKS_STAIRS);
        BlockModel(ModBlocks.ABYSSAL_BRICKS_CRACKED_STAIRS);
        BlockModel(ModBlocks.ABYSSAL_COBBLE_STAIRS);
        BlockModel(ModBlocks.ABYSSAL_SMOOTH_STAIRS);

        BlockModel(ModBlocks.QUARRIED_STONE_STAIRS);
        BlockModel(ModBlocks.QUARRIED_BRICKS_STAIRS);
        BlockModel(ModBlocks.QUARRIED_BRICKS_CRACKED_STAIRS);
        BlockModel(ModBlocks.QUARRIED_COBBLE_STAIRS);
        BlockModel(ModBlocks.QUARRIED_SMOOTH_STAIRS);

        BlockModel(ModBlocks.BURNT_STONE_STAIRS);
        BlockModel(ModBlocks.BURNT_BRICKS_STAIRS);
        BlockModel(ModBlocks.BURNT_BRICKS_CRACKED_STAIRS);
        BlockModel(ModBlocks.BURNT_COBBLE_STAIRS);
        BlockModel(ModBlocks.BURNT_SMOOTH_STAIRS);

        BlockModel(ModBlocks.ABYSSAL_STONE_SLAB);
        BlockModel(ModBlocks.ABYSSAL_BRICKS_SLAB);
        BlockModel(ModBlocks.ABYSSAL_BRICKS_CRACKED_SLAB);
        BlockModel(ModBlocks.ABYSSAL_COBBLE_SLAB);
        BlockModel(ModBlocks.ABYSSAL_SMOOTH_SLAB);

        BlockModel(ModBlocks.QUARRIED_STONE_SLAB);
        BlockModel(ModBlocks.QUARRIED_BRICKS_SLAB);
        BlockModel(ModBlocks.QUARRIED_BRICKS_CRACKED_SLAB);
        BlockModel(ModBlocks.QUARRIED_COBBLE_SLAB);
        BlockModel(ModBlocks.QUARRIED_SMOOTH_SLAB);

        BlockModel(ModBlocks.BURNT_STONE_SLAB);
        BlockModel(ModBlocks.BURNT_BRICK_SLAB);
        BlockModel(ModBlocks.BURNT_BRICK_CRACKED_SLAB);
        BlockModel(ModBlocks.BURNT_COBBLE_SLAB);
        BlockModel(ModBlocks.BURNT_SMOOTH_SLAB);

        BlockModel(ModBlocks.ABYSSAL_STONE_WALL,"inventory");
        BlockModel(ModBlocks.ABYSSAL_BRICKS_WALL,"inventory");
        BlockModel(ModBlocks.ABYSSAL_BRICKS_CRACKED_WALL,"inventory");
        BlockModel(ModBlocks.ABYSSAL_COBBLE_WALL,"inventory");
        BlockModel(ModBlocks.ABYSSAL_SMOOTH_WALL,"inventory");

        BlockModel(ModBlocks.QUARRIED_STONE_WALL,"inventory");
        BlockModel(ModBlocks.QUARRIED_BRICKS_WALL,"inventory");
        BlockModel(ModBlocks.QUARRIED_BRICKS_CRACKED_WALL,"inventory");
        BlockModel(ModBlocks.QUARRIED_COBBLE_WALL,"inventory");
        BlockModel(ModBlocks.QUARRIED_SMOOTH_WALL,"inventory");

        BlockModel(ModBlocks.BURNT_STONE_WALL,"inventory");
        BlockModel(ModBlocks.BURNT_BRICKS_WALL,"inventory");
        BlockModel(ModBlocks.BURNT_BRICKS_CRACKED_WALL,"inventory");
        BlockModel(ModBlocks.BURNT_COBBLE_WALL,"inventory");
        BlockModel(ModBlocks.BURNT_SMOOTH_WALL,"inventory");

        BlockModel(ModBlocks.FOREST_STONE_STAIRS);
        BlockModel(ModBlocks.FOREST_BRICKS_STAIRS);
        BlockModel(ModBlocks.FOREST_BRICKS_CRACKED_STAIRS);
        BlockModel(ModBlocks.FOREST_COBBLE_STAIRS);
        BlockModel(ModBlocks.FOREST_SMOOTH_STAIRS);
        BlockModel(ModBlocks.FOREST_STONE_SLAB);
        BlockModel(ModBlocks.FOREST_BRICK_SLAB);
        BlockModel(ModBlocks.FOREST_BRICK_CRACKED_SLAB);
        BlockModel(ModBlocks.FOREST_COBBLE_SLAB);
        BlockModel(ModBlocks.FOREST_SMOOTH_SLAB);
        BlockModel(ModBlocks.FOREST_STONE_WALL,"inventory");
        BlockModel(ModBlocks.FOREST_BRICKS_WALL,"inventory");
        BlockModel(ModBlocks.FOREST_BRICKS_CRACKED_WALL,"inventory");
        BlockModel(ModBlocks.FOREST_COBBLE_WALL,"inventory");
        BlockModel(ModBlocks.FOREST_SMOOTH_WALL,"inventory");



    }

    public void BlockModel(RegistryObject<? extends Block> block){
        withExistingParent(block.getId().getPath(),modLoc("block/" + block.getId().getPath()));
    }
    public void BlockModel(RegistryObject<? extends Block> block, String suffix) {
        withExistingParent(block.getId().getPath(), modLoc("block/" + block.getId().getPath() + "_" + suffix));
    }

}
