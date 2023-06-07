package net.aleganza.plentyofarmors.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ThornsEffect extends StatusEffect {
    public ThornsEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.getWorld().isClient()) {

            Entity attacker = pLivingEntity.getAttacker();
            int level = 1;

            // if hit
            if (pLivingEntity.hurtTime == 9) {
                if (attacker != null){
                    /*attacker.damage(DamageSource.thorns(pLivingEntity), pAmplifier + level);*/
                    attacker.damage(pLivingEntity.getWorld().getDamageSources().thorns(pLivingEntity), pAmplifier + level);
                }
            }
        }

        super.applyUpdateEffect(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}