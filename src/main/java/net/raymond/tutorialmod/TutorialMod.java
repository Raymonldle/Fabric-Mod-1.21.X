package net.raymond.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.raymond.tutorialmod.block.ModBlocks;
import net.raymond.tutorialmod.component.ModDataComponentTypes;
import net.raymond.tutorialmod.item.ModFoodComponents;
import net.raymond.tutorialmod.item.ModItemGroups;
import net.raymond.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItemGroups.registerItemGroups();
		ModDataComponentTypes.registerDataComponentTypes();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600);
	}
}