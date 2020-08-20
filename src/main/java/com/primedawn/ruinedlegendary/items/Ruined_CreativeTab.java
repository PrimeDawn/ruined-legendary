package com.primedawn.ruinedlegendary.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Ruined_CreativeTab extends ItemGroup {
    public Ruined_CreativeTab(){
        super("Ruined Legendary");
    }

    @Override
    public ItemStack createIcon(){
        return new ItemStack(Items.BOOK);
    }
}