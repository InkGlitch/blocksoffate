package net.inkthulu.blocksoffate.blocks.CustomBlocks;

import net.inkthulu.blocksoffate.Rewards;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;


public class FateBlock extends Block {
    public FateBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
        String blockName = String.valueOf(this.getName());
        PlayerEntity p = player;
        int result = (int) (Math.random()*(10)+1);
        Rewards.GiveReward(result, blockName, p, world, pos);
        super.afterBreak(world, player, pos, state, blockEntity, tool);
    }
}
