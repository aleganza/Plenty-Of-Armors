package net.aleganza.plentyofarmors.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.enchantment.ThornsEnchantment;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.enchantment.ThornsEnchantment.getDamageAmount;

public class ThornsEffect extends StatusEffect {
    public ThornsEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.world.isClient()) {

            /*World world = pLivingEntity.getWorld();
            BlockPos pos = pLivingEntity.getBlockPos();*/



            int level = 1;

            Random random = pLivingEntity.getRandom();

            /*attacker.damage(DamageSource.thorns(pLivingEntity), 3.0F);*/

            if(pLivingEntity.hurtTime == 9) {

                pLivingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK,
                        400, 1, false, false, false));


            }


            /*attacker.damage(DamageSource.thorns(pLivingEntity), (float)getDamageAmount(level, random));*/

        }

        super.applyUpdateEffect(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}