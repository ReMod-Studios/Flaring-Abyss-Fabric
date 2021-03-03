package com.remodstudios.flabyss.items_package;

import com.remodstudios.flabyss.FlaringAbyssMain;
import com.remodstudios.flabyss.blocks_package.BlocksRegistery;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistery {
    private static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier(FlaringAbyssMain.MOD_ID,"group"), () -> new ItemStack(BlocksRegistery.WILTSLATE));

    // "Items go here" - LePichu


    // "Block Items go blocky @ here" - LePichu, again
    public static final Item WILTSLATE = register(BlocksRegistery.WILTSLATE, "wiltslate", new Item.Settings().group(GROUP));
    public static final Item WILTSLATE_BRICKS = register(BlocksRegistery.WILTSLATE_BRICKS, "wiltslate_bricks.json", new Item.Settings().group(GROUP));

    // Methods
    public static void init () {
        // Loads Class(TM)
    }
    private static Item register(Item item, String name) {
        return Registry.register(Registry.ITEM, new Identifier(FlaringAbyssMain.MOD_ID, name), item);
    }

    private static Item register(Block block, String name, Item.Settings settings) {
        return register(new BlockItem(block, settings), name);
    }
}