package com.remodstudios.flabyss.items_package;

import com.remodstudios.flabyss.FlaringAbyssMain;
import com.remodstudios.flabyss.blocks_package.BlocksRegistery;
import com.remodstudios.yarnandneedles.items.ItemRegistry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("unused")
public class ItemRegistery extends ItemRegistry {
    public static final ItemRegistery INSTANCE = new ItemRegistery();

    private static final ItemGroup GROUP = FabricItemGroupBuilder.build(
            new Identifier(FlaringAbyssMain.MOD_ID,"group"),
            () -> new ItemStack(BlocksRegistery.INSTANCE.WILTSLATE)
    );

    // "Items go here" - LePichu
    public static final Item SCYTHE = register(new SwordItem(ToolMaterials.NETHERITE, 8, -2.4F, new Item.Settings().group(GROUP).maxCount(1)), "scythe");
    public static final Item CRYSTAL_METH = register(new Item(new Item.Settings().food(new FoodComponent.Builder().build()).group(GROUP)), "crystal_meth");
    public static final Item SUCCUBUS_MILK = register(new Item(new Item.Settings().food(new FoodComponent.Builder().alwaysEdible().snack().hunger(10).saturationModifier(10F).build()).group(GROUP)), "succubus_milk");
    public static final Item STYGIAN_IRON_SWORD = register(new StygianSword(ToolMaterials.IRON, 4, -2.4F, new Item.Settings().group(GROUP).maxCount(1)), "stygian_iron_sword");
    public static final Item STYGIAN_IRON_AXE = register(new StygianAxe(ToolMaterials.IRON, 4, -2.4F, new Item.Settings().group(GROUP).maxCount(1)), "stygian_iron_axe");
    public static final Item STYGIAN_IRON_PICKAXE = register(new StygianPickaxe(ToolMaterials.IRON, 4, -2.4F, new Item.Settings().group(GROUP).maxCount(1)), "stygian_iron_pickaxe");
    public static final Item STYGIAN_IRON_SHOVEL = register(new StygianShovel(ToolMaterials.IRON, 4, -2.4F, new Item.Settings().group(GROUP).maxCount(1)), "stygian_iron_shovel");
    public static final Item STYGIAN_IRON_HOE = register(new StygianHoe(ToolMaterials.IRON, 4, -2.4F, new Item.Settings().group(GROUP).maxCount(1)), "stygian_iron_hoe");

    // "Block Items go blocky @ here" - LePichu, again
    public final BlockItem WILTSLATE = addBlockItem("wiltslate", BlocksRegistery.INSTANCE.WILTSLATE);
    public final BlockItem WILTSLATE_BRICKS = addBlockItem("wiltslate_bricks", BlocksRegistery.INSTANCE.WILTSLATE_BRICKS);
    public final BlockItem CHISELED_WILTSLATE_BRICKS = addBlockItem("chiseled_wiltslate_bricks", BlocksRegistery.INSTANCE.CHISELED_WILTSLATE_BRICKS);
    public final BlockItem CRACKED_WILTSLATE_BRICKS = addBlockItem("cracked_wiltslate_bricks", BlocksRegistery.INSTANCE.CRACKED_WILTSLATE_BRICKS);

    public final BlockItem ARIDSTONE = addBlockItem("aridstone", BlocksRegistery.INSTANCE.ARIDSTONE);
    public final BlockItem ARIDSTONE_BRICKS = addBlockItem("aridstone_bricks", BlocksRegistery.INSTANCE.ARIDSTONE_BRICKS);
    public final BlockItem CHISELED_ARIDSTONE_BRICKS = addBlockItem("chiseled_aridstone_bricks", BlocksRegistery.INSTANCE.CHISELED_ARIDSTONE_BRICKS);
    public final BlockItem CRACKED_ARIDSTONE_BRICKS = addBlockItem("cracked_aridstone_bricks", BlocksRegistery.INSTANCE.CRACKED_ARIDSTONE_BRICKS);

    public final BlockItem RIMENIUM = addBlockItem("rimenium", BlocksRegistery.INSTANCE.RIMENIUM);
    public final BlockItem POLISHED_RIMENIUM = addBlockItem("polished_rimenium", BlocksRegistery.INSTANCE.POLISHED_RIMENIUM);

    public final BlockItem SOUL_DIAMOND_ORE = addBlockItem("soul_diamond_ore", BlocksRegistery.INSTANCE.SOUL_DIAMOND_ORE);
    public final BlockItem SOUL_GAS = addBlockItem("soul_gas", BlocksRegistery.INSTANCE.SOUL_GAS);
    public final BlockItem SOUL_SANDSTONE = addBlockItem("soul_sandstone", BlocksRegistery.INSTANCE.SOUL_SANDSTONE);
    public final BlockItem CUT_SOUL_SANDSTONE = addBlockItem("cut_soul_sandstone", BlocksRegistery.INSTANCE.CUT_SOUL_SANDSTONE);
    public final BlockItem CHISELED_SOUL_SANDSTONE = addBlockItem("chiseled_soul_sandstone", BlocksRegistery.INSTANCE.CHISELED_SOUL_SANDSTONE);

    // Methods and Extras
    public ItemRegistery(String namespace) {
        super(FlaringAbyssMain.MOD_ID);
    }

    public ItemRegistery() {
        super(FlaringAbyssMain.MOD_ID);
    }

    private static Item register(Item item, String name) {
        return Registry.register(Registry.ITEM, new Identifier(FlaringAbyssMain.MOD_ID, name), item);
    }

    private static Item register(Block block, String name, Item.Settings settings) {
        return register(new BlockItem(block, settings), name);
    }
}