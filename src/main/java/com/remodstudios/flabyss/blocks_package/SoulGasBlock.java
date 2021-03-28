package com.remodstudios.flabyss.blocks_package;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SoulGasBlock extends Block {
    public SoulGasBlock(Settings settings) {
        super(settings);
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, LivingEntity entity) {
        entity.applyStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3, 3));
        entity.applyStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 3, 1));
    }
}
