package com.primedawn.ruinedlegendary.oregen;

import com.primedawn.ruinedlegendary.blocks.BlcokRegistry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.DepthAverageConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class oregen {
    @SubscribeEvent
    public static void OnSetUpEvent(FMLCommonSetupEvent event){
        for(Biome biome: ForgeRegistries.BIOMES){
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlcokRegistry.chalcocite_ore.get().getDefaultState(),10)
            ).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(40,30,20))));
        }
    }
}
