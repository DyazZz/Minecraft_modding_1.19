package com.dyazzz.tutorialmod.item.custom;

import com.dyazzz.tutorialmod.item.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier RUBY = new ForgeTier(3, 1400, 16f,
            10f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            ()-> Ingredient.of(ModItems.RUBY.get()));
}
