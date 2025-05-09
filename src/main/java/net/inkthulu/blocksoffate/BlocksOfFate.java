package net.inkthulu.blocksoffate;

import net.fabricmc.api.ModInitializer;

import net.inkthulu.blocksoffate.blocks.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlocksOfFate implements ModInitializer {
	public static final String MOD_ID = "bof";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();

	}
}