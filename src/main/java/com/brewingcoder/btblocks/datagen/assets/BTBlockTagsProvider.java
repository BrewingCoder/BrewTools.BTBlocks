package com.brewingcoder.btblocks.datagen.assets;

import com.brewingcoder.btblocks.BTBlocks;
import com.brewingcoder.btblocks.blocks.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BTBlockTagsProvider extends BlockTagsProvider {

    public BTBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BTBlocks.MODID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        ModBlocks.BLOCKS.getEntries().forEach(block -> {
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block.get());
            tag(BlockTags.NEEDS_STONE_TOOL).add(block.get());

            String key = block.getId().toString();

            if(     key.equals(ModBlocks.ABYSSAL_STONE.getId().toString()) ||
                    key.equals(ModBlocks.QUARRIED_STONE.getId().toString()) ||
                    key.equals(ModBlocks.BURNT_STONE.getId().toString()) ||
                    key.equals(ModBlocks.FOREST_STONE.getId().toString())
            ){
                tag(Tags.Blocks.STONE).add(block.get());
            }

            if(key.contains("stairs")){
                tag(BlockTags.STAIRS).add(block.get());
            }
            if(key.contains("wall")){
                tag(BlockTags.WALLS).add(block.get());
            }
            if (key.contains("slab")){
                tag(BlockTags.SLABS).add(block.get());
            }
            if (key.contains("fence") && !key.contains("fence_gate")){
                tag(BlockTags.FENCES).add(block.get());
            }
            if (key.contains("fence_gate")){
                tag(BlockTags.FENCE_GATES).add(block.get());
            }

        });





    }
}
