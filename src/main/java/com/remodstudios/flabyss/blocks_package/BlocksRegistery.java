package com.remodstudios.flabyss.blocks_package;

import com.remodstudios.flabyss.FlaringAbyssMain;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlocksRegistery {
    // "cube-things go here" - LePichu
    public static final Block WILTSLATE = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"wiltslate");
    public static final Block WILTSLATE_BRICKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)), "wiltslate_bricks.json");

    // Methods
    private static Block register(Block block, String name) {
        return Registry.register(Registry.BLOCK, new Identifier(FlaringAbyssMain.MOD_ID, name), block);
    }

    public static void init() {
        // just loads the class
    }
}