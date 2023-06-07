package net.aleganza.plentyofarmors.effect;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class BouncingEffect extends StatusEffect {
    public BouncingEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.getWorld().isClient()) {
            /*Vec3d vec3d = pLivingEntity.getVelocity();*/
            bounce(pLivingEntity);
            double d = Math.abs(pLivingEntity.getVelocity().y);
        }

        super.applyUpdateEffect(pLivingEntity, pAmplifier);
    }

    private static void bounce(LivingEntity pLivingEntity) {
        Vec3d vec3d = pLivingEntity.getVelocity();
        if (vec3d.y < 0.0) {
            /*double d = 1.0;
            pLivingEntity.setVelocity(vec3d.x, -vec3d.y * d, vec3d.z);
            pLivingEntity.velocityModified = true;*/
            /*pLivingEntity.sendMessage(Text.literal("bounce"));*/
        } else {
            pLivingEntity.sendMessage(Text.literal("not bounce"));
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}