package net.aleganza.plentyofarmors.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.enchantment.SwiftSneakEnchantment;

public class SwiftSneakEffect extends StatusEffect {
    public SwiftSneakEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.world.isClient()) {
            if(pLivingEntity.isSneaking()) {
                // sneaking test
                /*pLivingEntity.damage(DamageSource.thorns(pLivingEntity), pAmplifier);*/
            }

        }

        super.applyUpdateEffect(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}