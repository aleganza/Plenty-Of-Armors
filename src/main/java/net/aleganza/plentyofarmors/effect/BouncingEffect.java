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
        if (!pLivingEntity.world.isClient()) {
            // bounce
            Vec3d vec3d = pLivingEntity.getVelocity();
            if (vec3d.y < 0.0) {
                if (pLivingEntity.isOnGround()) {
                    double d = 1.0;
                    pLivingEntity.setVelocity(vec3d.x, -vec3d.y * d, vec3d.z);
                    pLivingEntity.velocityModified = true;
                    pLivingEntity.sendMessage(Text.literal(String.valueOf(vec3d.y)));

                }
            }

            World world = pLivingEntity.getWorld();
            BlockPos pos = pLivingEntity.getBlockPos();
            BlockState state = pLivingEntity.getBlockStateAtPos();
        }

        super.applyUpdateEffect(pLivingEntity, pAmplifier);
    }

    /*private static void bounce(Entity entity) {
        Vec3d vec3d = entity.getVelocity();
        if (vec3d.y < 0.0) {
            double d = entity instanceof LivingEntity ? 1.0 : 0.8;
            entity.setVelocity(vec3d.x, -vec3d.y * d, vec3d.z);
        }
    }*/

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}