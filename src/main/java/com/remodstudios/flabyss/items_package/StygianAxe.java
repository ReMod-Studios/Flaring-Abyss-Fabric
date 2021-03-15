package com.remodstudios.flabyss.items_package;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class StygianAxe extends AxeItem {
    protected StygianAxe(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.applyStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 5, 2));
        return super.postHit(stack, target, attacker);
    }
}
