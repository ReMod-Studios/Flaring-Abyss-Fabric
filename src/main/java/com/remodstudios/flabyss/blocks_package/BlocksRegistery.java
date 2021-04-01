package com.remodstudios.flabyss.blocks_package;

import com.remodstudios.flabyss.FlaringAbyssMain;
import com.remodstudios.flabyss.misc_package.ModMaterials;
import com.remodstudios.yarnandneedles.blocks.BlockRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BlocksRegistery extends BlockRegistry {
    public static final BlocksRegistery INSTANCE = new BlocksRegistery();

    // "cube-things go here" - LePichu

    // "mod additions" - LePichu
    public final Block WILTSLATE = add("wiltslate", new Block(FabricBlockSettings.of(ModMaterials.WILTSLATE_MATERIAL).hardness(2.5F).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));
    public final Block WILTSLATE_BRICKS = add("wiltslate_bricks", new Block(FabricBlockSettings.copyOf(WILTSLATE)));
    public final Block CRACKED_WILTSLATE_BRICKS = add("cracked_wiltslate_bricks", new Block(FabricBlockSettings.copyOf(WILTSLATE)));
    public final Block CHISELED_WILTSLATE_BRICKS = add("chiseled_wiltslate_bricks", new Block(FabricBlockSettings.copyOf(WILTSLATE)));

    public final Block ARIDSTONE = add("aridstone", new Block(FabricBlockSettings.of(ModMaterials.ARIDSTONE_MATERIAL).hardness(2.5F).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public final Block ARIDSTONE_BRICKS = add("aridstone_bricks", new Block(FabricBlockSettings.of(ModMaterials.ARIDSTONE_MATERIAL).hardness(2.5F).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public final Block CRACKED_ARIDSTONE_BRICKS = add("cracked_aridstone_bricks", new Block(FabricBlockSettings.of(ModMaterials.ARIDSTONE_MATERIAL).hardness(2.5F).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public final Block CHISELED_ARIDSTONE_BRICKS = add("chiseled_aridstone_bricks", new Block(FabricBlockSettings.of(ModMaterials.ARIDSTONE_MATERIAL).hardness(2.5F).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.GILDED_BLACKSTONE)));

    public final Block RIMENIUM = add("rimenium", new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).of(ModMaterials.RIMENIUM_MATERIAL)));
    public final Block POLISHED_RIMENIUM = add("polished_rimenium", new Block(FabricBlockSettings.copyOf(RIMENIUM)));

    // "vanilla-ish expansions" - LePichu
    public final Block BASALT_IRON_ORE = add("basalt_iron_ore", new Block(FabricBlockSettings.copyOf(Blocks.BASALT)));

    public final Block SOUL_DIAMOND_ORE = add("soul_diamond_ore", new Block(FabricBlockSettings.copyOf(Blocks.SOUL_SAND)));
    public final Block SOUL_GAS = add("soul_gas", new SoulGasBlock(FabricBlockSettings.of(Material.AIR).sounds(BlockSoundGroup.WOOL).breakInstantly().noCollision()));
    public final Block SOUL_SANDSTONE = add("soul_sandstone", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public final Block CUT_SOUL_SANDSTONE = add("cut_soul_sandstone", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public final Block CHISELED_SOUL_SANDSTONE = add("chiseled_soul_sandstone", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    // endregion
    public BlocksRegistery() {
        super(FlaringAbyssMain.MOD_ID);
    }
}