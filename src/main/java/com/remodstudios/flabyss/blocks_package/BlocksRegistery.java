package com.remodstudios.flabyss.blocks_package;

import com.remodstudios.flabyss.FlaringAbyssMain;
import com.remodstudios.yarnandneedles.blocks.BlockRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlocksRegistery extends BlockRegistry {
    public static final BlocksRegistery INSTANCE = new BlocksRegistery();

    // "cube-things go here" - LePichu
    public static final Block WILTSLATE = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"wiltslate");
    public static final Block WILTSLATE_BRICKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)), "wiltslate_bricks.json");

    public BlocksRegistery(String namespace) {
        super(namespace);
    }

    public BlocksRegistery() {
        super(FlaringAbyssMain.MOD_ID);
    }

    // Methods
    private static Block register(Block block, String name) {
        return Registry.register(Registry.BLOCK, new Identifier(FlaringAbyssMain.MOD_ID, name), block);
    }
}