package net.aleganza.plentyofarmors.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.Vec3d;

public class BouncingEffect extends StatusEffect {
    public BouncingEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.getWorld().isClient()) {
            Vec3d vec3d = pLivingEntity.getVelocity();
            if (vec3d.y < 0.0) {
                /*double d = 1.0;
                pLivingEntity.setVelocity(vec3d.x, -vec3d.y * d, vec3d.z);
                pLivingEntity.velocityModified = true;*/
            }
        }

        return super.applyUpdateEffect(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}
