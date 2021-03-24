package com.remodstudios.flabyss.mixin_package;

import com.remodstudios.flabyss.items_package.ItemRegistery;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(PlayerEntity.class)
public class CrystalMethDosageCounterMixin {
    @Inject(at = @At("HEAD"), method = "eatFood")
    public ItemStack eatFood(World world, ItemStack stack, PlayerEntity player) {
        int dosageCounter = 0;
        if(stack.getName()== ItemRegistery.CRYSTAL_METH && stack.getMaxUseTime()==1.6){
            dosageCounter++;
            int deathRandom = world.random.nextInt(10);
            int deathChance = deathRandom + dosageCounter;
            if (10 < deathChance) {
                player.damage(DamageSource.IN_WALL, 300);
            }
        }
        return stack;
    }
}