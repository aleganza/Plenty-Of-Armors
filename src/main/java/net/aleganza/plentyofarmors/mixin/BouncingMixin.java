package net.aleganza.plentyofarmors.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlimeBlock;
import net.minecraft.entity.Entity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SlimeBlock.class)
public class BouncingMixin {
    /*@Inject(method = "bounce", at = @At("HEAD"))
    public void bounce(Entity entity, CallbackInfo info) {
        entity.sendMessage(Text.literal("bounce"));
    }

    @Inject(method = "onLandedUpon", at = @At("HEAD"))
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance, CallbackInfo info) {
        entity.sendMessage(Text.literal("onLandedUpon"));
    }

    @Inject(method = "onEntityLand", at = @At("HEAD"))
    public void onEntityLand(BlockView world, Entity entity, CallbackInfo info) {
        entity.sendMessage(Text.literal("onEntityLand"));
    }

    @Inject(method = "onSteppedOn", at = @At("HEAD"))
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity, CallbackInfo info) {
        entity.sendMessage(Text.literal("onSteppedOn"));
    }*/
}
