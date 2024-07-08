package com.brewingcoder.btblocks.datagen.assets;

import com.brewingcoder.btblocks.blocks.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class BTBlockLootProvider extends BlockLootSubProvider {


    protected BTBlockLootProvider() {

        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        ModBlocks.BLOCKS.getEntries().forEach(block->{
            this.dropSelf(block.get());
        });
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
