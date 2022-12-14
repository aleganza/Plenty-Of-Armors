package net.aleganza.plentyofarmors.effect;

import net.aleganza.plentyofarmors.PlentyOfArmors;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModEffects {
    public static StatusEffect FROST_WALKER;
    public static StatusEffect FIRE_WALKER;
    public static StatusEffect THORNS;

    public static StatusEffect registerFrostWalker(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(PlentyOfArmors.MOD_ID, name),
                new FrostWalkerEffect(StatusEffectCategory.NEUTRAL, 0x5fb2d9));
    }
    public static StatusEffect registerHeatWalker(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(PlentyOfArmors.MOD_ID, name),
                new FireWalkerEffect(StatusEffectCategory.NEUTRAL, 0x9e3c28));
    }
    public static StatusEffect registerThorns(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(PlentyOfArmors.MOD_ID, name),
                new ThornsEffect(StatusEffectCategory.BENEFICIAL, 0x289e33));
    }

    public static void registerEffects() {
        FROST_WALKER = registerFrostWalker("frost_walker");
        FIRE_WALKER = registerHeatWalker("fire_walker");
        THORNS = registerThorns("thorns");
    }
}
