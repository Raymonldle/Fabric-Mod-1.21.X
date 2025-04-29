package net.raymond.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.raymond.tutorialmod.block.ModBlocks;
import net.raymond.tutorialmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BISMUTH_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BISMUTH_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BISMUTH_DEEPSLATE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALEXANDRITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALEXANDRITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);

        itemModelGenerator.register(ModItems.BISMUTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_BISMUTH, Models.GENERATED);

        itemModelGenerator.register(ModItems.ALEXANDRITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ALEXANDRITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.COKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_EGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STARLIGHT_ASHES, Models.GENERATED);
    }
}