package net.inkthulu.blocksoffate;

import net.minecraft.block.Block;
import net.minecraft.block.StructureBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.StructureSpawns;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.gen.chunk.placement.StructurePlacement;
import net.minecraft.world.gen.structure.Structure;

import java.awt.event.ItemEvent;

public class Rewards {


    public static void GiveReward(int probabilityNum, String blockType, PlayerEntity player, World world, BlockPos pos){
        if(blockType.contains("whisper_of_fate"))
        {
            if(probabilityNum <=5){
                player.sendMessage(Text.of("This is a common result, Yippee!"));

            } else if (probabilityNum <=8) {
                ItemStack emeralds = new ItemStack(Items.EMERALD, 5);
                Block.dropStack(world, pos, emeralds);
            }
            else {
                EntityType<CatEntity> jiji = EntityType.CAT;
                world.emitGameEvent(player, GameEvent.ENTITY_PLACE, player.getBlockPos());
                Entity jijiCat = jiji.spawn((ServerWorld) world, pos, SpawnReason.COMMAND);

            }
        }

    }

}
