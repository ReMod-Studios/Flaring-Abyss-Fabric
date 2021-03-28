package com.remodstudios.flabyss.blocks_package;

import com.remodstudios.flabyss.FlaringAbyssMain;
import com.remodstudios.flabyss.misc_package.ModMaterials;
import com.remodstudios.yarnandneedles.blocks.BlockRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class BlocksRegistery extends BlockRegistry {
    public static final BlocksRegistery INSTANCE = new BlocksRegistery();

    // "cube-things go here" - LePichu
    public final Block WILTSLATE = new Block(FabricBlockSettings.of(ModMaterials.WILTSLATE_MATERIAL).hardness(2.5F).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS));
    public final Block WILTSLATE_BRICKS = new Block(FabricBlockSettings.copyOf(WILTSLATE));
    public final Block CRACKED_WILTSLATE_BRICKS = new Block(FabricBlockSettings.copyOf(WILTSLATE));
    public final Block CHISELED_WILTSLATE_BRICKS = new Block(FabricBlockSettings.copyOf(WILTSLATE));



    // endregion
    public BlocksRegistery() {
        super(FlaringAbyssMain.MOD_ID);
    }
}