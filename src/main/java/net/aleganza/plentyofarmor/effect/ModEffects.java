package net.aleganza.plentyofarmor.effect;

import net.aleganza.plentyofarmor.PlentyOfArmor;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEffects {
    public static StatusEffect FROST_WALKER;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(PlentyOfArmor.MOD_ID, name),
                new FrostWalkerEffect(StatusEffectCategory.NEUTRAL, 3124687));
    }

    public static void registerEffects() {
        FROST_WALKER = registerStatusEffect("frost_walker");
    }
}
