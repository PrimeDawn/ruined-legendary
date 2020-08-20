package com.primedawn.ruinedlegendary.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlcokRegistry {
    public static final DeferredRegister<Block> Blocks = new DeferredRegister<>(ForgeRegistries.BLOCKS,"ruined");
    public static RegistryObject<Block> chalcocite_ore = Blocks.register("chalcocite_ore",()->{ return new chalcocote_ore(); });
}
