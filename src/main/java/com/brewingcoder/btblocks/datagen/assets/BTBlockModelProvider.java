package com.brewingcoder.btblocks.datagen.assets;

import com.brewingcoder.btblocks.BTBlocks;
import com.brewingcoder.btblocks.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BTBlockModelProvider extends BlockModelProvider {

    public BTBlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BTBlocks.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //cubeAll(ModBlocks.ABYSSAL_STONE.getId().getPath(), modLoc("textures/block/abyssal"));

    }
}
