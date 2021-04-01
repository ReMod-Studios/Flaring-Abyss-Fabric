package com.remodstudios.flabyss.mixin_package;


import com.google.common.collect.ImmutableList;
import com.remodstudios.flabyss.blocks_package.BlocksRegistery;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.surfacebuilder.SoulSandValleySurfaceBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.minecraft.block.Blocks.SOUL_SAND;
import static net.minecraft.block.Blocks.SOUL_SOIL;

@Mixin(SoulSandValleySurfaceBuilder.class)
public class SoulSandValleyCappedSurfaceMixin {
    @Inject(at = @At("HEAD"), method = "getSurfaceStates", cancellable = true)
    protected void getSurfaceStates(CallbackInfoReturnable<ImmutableList<BlockState>> cir) {
        final ImmutableList<BlockState> SURFACE_STATES = ImmutableList.of(
                SOUL_SAND.getDefaultState(),
                SOUL_SOIL.getDefaultState(),
                BlocksRegistery.INSTANCE.SOUL_SANDSTONE.getDefaultState()
        );
        cir.setReturnValue(SURFACE_STATES);
    }
}