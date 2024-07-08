package com.brewingcoder.btblocks.datagen.assets;

import com.brewingcoder.btblocks.BTBlocks;
import com.brewingcoder.btblocks.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class ENLanguageProvider extends LanguageProvider {
    public ENLanguageProvider(PackOutput output) {
        super(output, BTBlocks.MODID,"en_us");
    }

    @Override
    protected void addTranslations() {
        ModBlocks.BLOCKS.getEntries().forEach(block -> add(block,"block"));
    }

    private void add(RegistryObject<?> entry, String prefix){
        String key = entry.getId().getPath();
        add(prefix + "." + BTBlocks.MODID +"."+key,convertToName(key));
    }

    private String convertToName(String key) {
        StringBuilder builder = new StringBuilder(key.substring(0, 1).toUpperCase() + key.substring(1));
        for(int i = 1; i < builder.length(); i++) {
            if(builder.charAt(i) == '_') {
                builder.deleteCharAt(i);
                builder.replace(i, i + 1, " " + Character.toUpperCase(builder.charAt(i)));
            }
        }

        return  builder.toString();
    }

}