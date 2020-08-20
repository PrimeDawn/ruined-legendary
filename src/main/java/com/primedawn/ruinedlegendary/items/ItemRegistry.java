package com.primedawn.ruinedlegendary.items;

import com.primedawn.ruinedlegendary.blocks.BlcokRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> Items = new DeferredRegister<>(ForgeRegistries.ITEMS, "ruined");
    public static RegistryObject<Item> chalcocite = Items.register("chalcocite", () -> { return new chalcocite(); });
    public static RegistryObject<Item> chalcocite_bar = Items.register("chalcocite_bar",()->{ return new chalcocite_bar();});
    public static RegistryObject<Item> ferrocobalt =  Items.register("ferrocobalt",()->{return new ferrocobalt();});
    public static RegistryObject<Item> ferrocobalt_bar =  Items.register("ferrocobalt_bar",()->{return new ferrocobalt_bar();});

    public static RegistryObject<Item> chalcocite_ore = Items.register("chalcocite_ore",()->{return new BlockItem(BlcokRegistry.chalcocite_ore.get(),new Item.Properties().group(Modgroup.itemgroup));
    });

}
