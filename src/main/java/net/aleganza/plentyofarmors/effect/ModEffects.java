package net.aleganza.plentyofarmors.effect;

import net.aleganza.plentyofarmors.PlentyOfArmors;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;


public class ModEffects {
    public static RegistryEntry<StatusEffect> FROST_WALKER;
    public static RegistryEntry<StatusEffect> FIRE_WALKER;
    public static RegistryEntry<StatusEffect> THORNS;
    /*public static RegistryEntry<StatusEffect> SWIFT_SNEAK;*/
    /*public static RegistryEntry<StatusEffect> BOUNCING;*/
    /*public static RegistryEntry<StatusEffect> XP_ENHANCER;*/

    public static RegistryEntry<StatusEffect> registerFrostWalker(String name) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(PlentyOfArmors.MOD_ID, name),
                new FrostWalkerEffect(StatusEffectCategory.NEUTRAL, 0x5fb2d9));
    }
    public static RegistryEntry<StatusEffect> registerHeatWalker(String name) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(PlentyOfArmors.MOD_ID, name),
                new FireWalkerEffect(StatusEffectCategory.NEUTRAL, 0x9e3c28));
    }
    public static RegistryEntry<StatusEffect> registerThorns(String name) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(PlentyOfArmors.MOD_ID, name),
                new ThornsEffect(StatusEffectCategory.BENEFICIAL, 0x289e33));
    }
    /*public static StatusEffect registerSwiftSneak(String name) {
        return Registry.register(Registries.STATUS_EFFECT, Identifier.of(PlentyOfArmors.MOD_ID, name),
                new SwiftSneakEffect(StatusEffectCategory.NEUTRAL, 0x065769));
    }*/
    /*public static StatusEffect registerBouncing(String name) {
        return Registry.register(Registries.STATUS_EFFECT, Identifier.of(PlentyOfArmors.MOD_ID, name),
                new BouncingEffect(StatusEffectCategory.BENEFICIAL, 0xf6f121));
    }
    public static StatusEffect registerXPEnhancer(String name) {
        return Registry.register(Registries.STATUS_EFFECT, Identifier.of(PlentyOfArmors.MOD_ID, name),
                new XPEnhancerEffect(StatusEffectCategory.BENEFICIAL, 0xf6f121));
    }*/

    public static void registerEffects() {
        FROST_WALKER = registerFrostWalker("frost_walker");
        FIRE_WALKER = registerHeatWalker("fire_walker");
        THORNS = registerThorns("thorns");
        /*SWIFT_SNEAK = registerSwiftSneak("swift_sneak");*/
        /*BOUNCING = registerBouncing("bouncing");
        XP_ENHANCER = registerXPEnhancer("xp_enhancer");*/
    }
}
