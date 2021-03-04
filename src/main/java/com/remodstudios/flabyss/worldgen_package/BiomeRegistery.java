package com.remodstudios.flabyss.worldgen_package;

import com.remodstudios.flabyss.FlaringAbyssMain;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class BiomeRegistery {


    // Methods
    public static RegistryKey<Biome> register(Biome biome){
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(FlaringAbyssMain.MOD_ID, biome.toString()));
    }
//    public static ConfiguredSurfaceBuilders<TernarySurfaceConfig> register(BlockState topMaterial, BlockState bottomMaterial){
//        return SurfaceBuilder.DEFAULT.withConfig(new TernarySurfaceConfig().getTopMaterial(topMaterial));
//    }
}