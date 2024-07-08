package com.brewingcoder.btblocks.datagen.assets;

import com.brewingcoder.btblocks.BTBlocks;
import com.brewingcoder.btblocks.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class BTRecipeProvider extends RecipeProvider {


    public BTRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> writer) {
        AddCraftingRecipes(writer);
        AddStoneCuttingRecipes(writer);
    }

    private void AddCraftingRecipes(Consumer<FinishedRecipe> writer){
        //slab(writer,RecipeCategory.BUILDING_BLOCKS, ModBlocks.ABYSSAL_STONE_SLAB.get(),ModBlocks.ABYSSAL_STONE.get());
    }

    private void AddStoneCuttingRecipes(Consumer<FinishedRecipe> writer){

        stoneCuttingRecipe(writer,Blocks.STONE,ModBlocks.ABYSSAL_STONE.get(),9);
        stoneCuttingRecipe(writer,Blocks.STONE,ModBlocks.QUARRIED_STONE.get(),9);

        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_STONE.get(), ModBlocks.ABYSSAL_BRICKS.get());
        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_STONE.get(), ModBlocks.ABYSSAL_BRICKS_CRACKED.get());
        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_STONE.get(), ModBlocks.ABYSSAL_COBBLE.get());
        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_STONE.get(), ModBlocks.ABYSSAL_SMOOTH.get());

        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_STONE.get(),ModBlocks.ABYSSAL_STONE_SLAB.get(),2);
        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_BRICKS.get(),ModBlocks.ABYSSAL_BRICKS_SLAB.get(),2);
        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_BRICKS_CRACKED.get(),ModBlocks.ABYSSAL_BRICKS_CRACKED_SLAB.get(),2);
        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_COBBLE.get(),ModBlocks.ABYSSAL_COBBLE_SLAB.get(),2);
        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_SMOOTH.get(),ModBlocks.ABYSSAL_SMOOTH_SLAB.get(),2);

        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_STONE.get(),ModBlocks.ABYSSAL_STONE_STAIRS.get());
        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_BRICKS.get(),ModBlocks.ABYSSAL_BRICKS_STAIRS.get());
        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_BRICKS_CRACKED.get(),ModBlocks.ABYSSAL_BRICKS_CRACKED_STAIRS.get());
        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_COBBLE.get(),ModBlocks.ABYSSAL_COBBLE_STAIRS.get());
        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_SMOOTH.get(),ModBlocks.ABYSSAL_SMOOTH_STAIRS.get());

        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_STONE.get(),ModBlocks.ABYSSAL_STONE_WALL.get());
        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_BRICKS.get(),ModBlocks.ABYSSAL_BRICKS_WALL.get());
        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_BRICKS_CRACKED.get(),ModBlocks.ABYSSAL_BRICKS_CRACKED_WALL.get());
        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_COBBLE.get(),ModBlocks.ABYSSAL_COBBLE_WALL.get());
        stoneCuttingRecipe(writer,ModBlocks.ABYSSAL_SMOOTH.get(),ModBlocks.ABYSSAL_SMOOTH_WALL.get());

        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_STONE.get(), ModBlocks.QUARRIED_BRICKS.get());
        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_STONE.get(), ModBlocks.QUARRIED_BRICKS_CRACKED.get());
        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_STONE.get(), ModBlocks.QUARRIED_COBBLE.get());
        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_STONE.get(), ModBlocks.QUARRIED_SMOOTH.get());

        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_STONE.get(), ModBlocks.QUARRIED_STONE_SLAB.get(),2);
        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_BRICKS.get(), ModBlocks.QUARRIED_BRICKS_SLAB.get(),2);
        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_BRICKS_CRACKED.get(), ModBlocks.QUARRIED_BRICKS_CRACKED_SLAB.get(),2);
        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_COBBLE.get(), ModBlocks.QUARRIED_COBBLE_SLAB.get(),2);
        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_SMOOTH.get(), ModBlocks.QUARRIED_SMOOTH_SLAB.get(),2);

        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_STONE.get(), ModBlocks.QUARRIED_STONE_STAIRS.get());
        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_BRICKS.get(), ModBlocks.QUARRIED_BRICKS_STAIRS.get());
        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_BRICKS_CRACKED.get(), ModBlocks.QUARRIED_BRICKS_CRACKED_STAIRS.get());
        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_COBBLE.get(), ModBlocks.QUARRIED_COBBLE_STAIRS.get());
        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_SMOOTH.get(), ModBlocks.QUARRIED_SMOOTH_STAIRS.get());

        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_STONE.get(), ModBlocks.QUARRIED_STONE_WALL.get());
        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_BRICKS.get(), ModBlocks.QUARRIED_BRICKS_WALL.get());
        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_BRICKS_CRACKED.get(), ModBlocks.QUARRIED_BRICKS_CRACKED_WALL.get());
        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_COBBLE.get(), ModBlocks.QUARRIED_COBBLE_WALL.get());
        stoneCuttingRecipe(writer,ModBlocks.QUARRIED_SMOOTH.get(), ModBlocks.QUARRIED_SMOOTH_WALL.get());

    }

    private void stoneCuttingRecipe(Consumer<FinishedRecipe> writer, ItemLike ingredient, ItemLike result) {
        stoneCuttingRecipe(writer, ingredient, result, 1);
    }

    private void stoneCuttingRecipe(Consumer<FinishedRecipe> writer, ItemLike ingredient, ItemLike result, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), RecipeCategory.BUILDING_BLOCKS, result, count).unlockedBy(getHasName(ingredient), has(ingredient)).save(writer, new ResourceLocation(BTBlocks.MODID,getConversionRecipeName(result, ingredient) + "_stonecutting"));
    }
}
