package net.aleganza.plentyofarmor.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FireWalkerEffect extends StatusEffect {
    public FireWalkerEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.world.isClient()) {

            World world = pLivingEntity.getWorld();
            BlockPos pos = pLivingEntity.getBlockPos();
            int level = 0;

            ModLibs.solidifyLava(pLivingEntity, world, pos, level);
        }

        super.applyUpdateEffect(pLivingEntity, pAmplifier);
    }



    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}