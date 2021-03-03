package com.remodstudios.flabyss.items_package;

import com.remodstudios.flabyss.FlaringAbyssMain;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistery {
    // "Items go here" - LePichu


    // "Block Items go blocky @ here" - LePichu, again



    // Methods
    public static void init () {
        // Loads Class(TM)
    }
    private static Item register(Item item, String name) {
        return ClientSpriteRegistryCallback.Registry.register(Registry.ITEM, new Identifier(FlaringAbyssMain.MOD_ID, name), item);
    }

    private static Item register(Block block, String name, Item.Settings settings) {
        return register(new BlockItem(block, settings), name);
    }
}