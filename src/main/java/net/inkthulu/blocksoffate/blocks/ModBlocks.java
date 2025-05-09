package net.inkthulu.blocksoffate.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.inkthulu.blocksoffate.BlocksOfFate;
import net.inkthulu.blocksoffate.blocks.CustomBlocks.FateBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;


public class ModBlocks {

    public static final Block FUTURE_FATE_BLOCK = registerBlock("future_fate_block",
            new FateBlock(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)));

    public static final Block GLIMPSE_FATE_BLOCK = registerBlock("glimpse_fate_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)));

    public static final Block WHISPER_OF_FATE = registerBlock("whisper_of_fate",
            new FateBlock(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)));

    public static final Block GLIMPSE_OF_FATE = registerBlock("glimpse_of_fate",
            new FateBlock(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)));

    public static final Block TETHERED_FATE = registerBlock("tethered_fate",
            new FateBlock(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)));

    public static final Block GRASP_OF_FATE = registerBlock("grasp_of_fate",
            new FateBlock(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)));

    public static final Block BOND_OF_FATE = registerBlock("bond_of_fate",
            new FateBlock(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)));

    public static final Block SEAL_OF_FATE = registerBlock("seal_of_fate",
            new FateBlock(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return  Registry.register(Registries.BLOCK, Identifier.of(BlocksOfFate.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(BlocksOfFate.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        BlocksOfFate.LOGGER.info("Register modded blocks for " + BlocksOfFate.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(fabricItemGroupEntries ->  {
            fabricItemGroupEntries.add(ModBlocks.FUTURE_FATE_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(fabricItemGroupEntries ->  {
            fabricItemGroupEntries.add(ModBlocks.GLIMPSE_FATE_BLOCK);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(fabricItemGroupEntries ->  {
            fabricItemGroupEntries.add(ModBlocks.GLIMPSE_OF_FATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(fabricItemGroupEntries ->  {
            fabricItemGroupEntries.add(ModBlocks.WHISPER_OF_FATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(fabricItemGroupEntries ->  {
            fabricItemGroupEntries.add(ModBlocks.TETHERED_FATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(fabricItemGroupEntries ->  {
            fabricItemGroupEntries.add(ModBlocks.GRASP_OF_FATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(fabricItemGroupEntries ->  {
            fabricItemGroupEntries.add(ModBlocks.BOND_OF_FATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(fabricItemGroupEntries ->  {
            fabricItemGroupEntries.add(ModBlocks.SEAL_OF_FATE);
        });

    }
}
