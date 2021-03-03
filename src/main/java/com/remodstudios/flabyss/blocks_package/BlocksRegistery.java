package com.remodstudios.flabyss.blocks_package;

import com.remodstudios.flabyss.FlaringAbyssMain;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static net.minecraft.block.Blocks.*;

public class BlocksRegistery {



    // Methods
    private static Block register(Block block, String name) {
        return Registry.register(Registry.BLOCK, new Identifier(FlaringAbyssMain.MOD_ID, name), block);
    }

    public static void init() {
        // just loads the class
    }
}