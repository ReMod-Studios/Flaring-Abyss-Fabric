package com.remodstudios.flabyss.misc_package;

import net.minecraft.block.MapColor;
import net.minecraft.block.Material;

public final class ModMaterials {

    // "materials go here" - LePichu
    public static final Material WILTSLATE_MATERIAL;
    public static final Material ARIDSTONE_MATERIAL;
    public static final Material RIMENIUM_MATERIAL;

    // "initialization go brr" - LePichu
    static {
        WILTSLATE_MATERIAL = (new Material.Builder(MapColor.DARK_GREEN).build());
        ARIDSTONE_MATERIAL = (new Material.Builder(MapColor.ORANGE).build());
        RIMENIUM_MATERIAL = (new Material.Builder(MapColor.LIGHT_BLUE).build());
    }
}
