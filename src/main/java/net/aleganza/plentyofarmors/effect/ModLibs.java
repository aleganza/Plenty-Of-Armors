package net.aleganza.plentyofarmors.effect;

import net.minecraft.block.*;
import net.minecraft.enchantment.ThornsEnchantment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Iterator;

public class ModLibs {

    public static void solidifyLava(LivingEntity entity, World world, BlockPos blockPos, int level) {
        if (entity.isOnGround()) {
            BlockState blockState = Blocks.BLACKSTONE.getDefaultState();
            float f = (float)Math.min(16, 2 + level);
            BlockPos.Mutable mutable = new BlockPos.Mutable();
            Iterator var7 = BlockPos.iterate(blockPos.add((double)(-f), -1.0D, (double)(-f)), blockPos.add((double)f, -1.0D, (double)f)).iterator();

            while(var7.hasNext()) {
                BlockPos blockPos2 = (BlockPos)var7.next();
                if (blockPos2.isWithinDistance(entity.getPos(), (double)f)) {
                    mutable.set(blockPos2.getX(), blockPos2.getY() + 1, blockPos2.getZ());
                    BlockState blockState2 = world.getBlockState(mutable);
                    if (blockState2.isAir()) {
                        BlockState blockState3 = world.getBlockState(blockPos2);
                        if (blockState3.getMaterial() == Material.LAVA && (Integer)blockState3.get(FluidBlock.LEVEL) == 0 && blockState.canPlaceAt(world, blockPos2) && world.canPlace(blockState, blockPos2, ShapeContext.absent())) {
                            world.setBlockState(blockPos2, blockState);
                            world.createAndScheduleBlockTick(blockPos2, Blocks.BLACKSTONE, MathHelper.nextInt(entity.getRandom(), 60, 120));
                        }
                    }
                }
            }
        }
    }

}
