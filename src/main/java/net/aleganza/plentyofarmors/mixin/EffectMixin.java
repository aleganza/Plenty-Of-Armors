package net.aleganza.plentyofarmors.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayerEntity.class)
public class EffectMixin {
    /*@Final @Shadow protected MinecraftClient client;

    @Inject(method = "setExperience", at = @At("HEAD"))
    public void setExperience(float progress, int total, int level, CallbackInfo info) {
        ClientPlayerEntity player = client.player;
        client-
        int currentLevel = player.experienceLevel;
        player.sendMessage(Text.literal(String.valueOf(level)));

        if (level > currentLevel) {
            player.sendMessage(Text.literal("I leveled up to level " + level));
        }
    }*/

    /*@Inject(at = @At("HEAD"), method = "setExperience")
    public void setExperience1(float progress, int total, int level, CallbackInfo info) {
        ClientPlayerEntity player = client.player;
        int currentLevel = player.experienceLevel;

        player.sendMessage(Text.literal(progress + " " + total + " " + level));


        if (level > currentLevel && player.hasStatusEffect(ModEffects.XP_ENHANCER)) {
            player.sendMessage(Text.literal("I leveled up to level " + level));
            progress = 0;
            total = 0;
            level = 0;
        }
    }*/

    /*@ModifyVariable(method = "setExperience", at = @At("HEAD"), ordinal = 0)
    public int setExperience2 (int total) {
        ClientPlayerEntity player = client.player;
        total = player.getNextLevelExperience();

        player.sendMessage(Text.literal("Cucu" + String.valueOf(player.getNextLevelExperience()) + " " + total));

        return total;
    }*/
}
