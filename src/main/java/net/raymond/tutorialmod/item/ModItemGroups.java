package net.raymond.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.raymond.tutorialmod.TutorialMod;
import net.raymond.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "pink_garnet_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);


                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

                        entries.add(ModBlocks.PINK_GARNET_SLAB);
                        entries.add(ModBlocks.PINK_GARNET_FENCE);
                        entries.add(ModBlocks.PINK_GARNET_FENCE_GATE);
                        entries.add(ModBlocks.PINK_GARNET_DOOR);
                        entries.add(ModBlocks.PINK_GARNET_TRAPDOOR);
                        entries.add(ModBlocks.PINK_GARNET_WALL);
                        entries.add(ModBlocks.PINK_GARNET_STAIRS);
                        entries.add(ModBlocks.PINK_GARNET_BUTTON);
                        entries.add(ModBlocks.PINK_GARNET_PRESSURE_PLATE);




                    }).build());


    public static final ItemGroup ALEXANDRITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "alexandrite_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE))
                    .displayName(Text.translatable("itemgroup.tutorialmod.alexandrite_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ALEXANDRITE);
                        entries.add(ModItems.RAW_ALEXANDRITE);

                        entries.add(ModBlocks.ALEXANDRITE_BLOCK);
                        entries.add(ModBlocks.ALEXANDRITE_ORE);
                        entries.add(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE);

                    }).build());

    public static final ItemGroup BISMUTH_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "bismuth_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BISMUTH))
                    .displayName(Text.translatable("itemgroup.tutorialmod.bismuth_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BISMUTH);
                        entries.add(ModItems.RAW_BISMUTH);

                        entries.add(ModBlocks.BISMUTH_BLOCK);
                        entries.add(ModBlocks.BISMUTH_ORE);
                        entries.add(ModBlocks.BISMUTH_DEEPSLATE_ORE);

                    }).build());

    public static final ItemGroup MISCELLANEOUS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "miscellaneous_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.COOKED_EGG))
                    .displayName(Text.translatable("itemgroup.tutorialmod.miscellaneous_group"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.CHISEL);
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.PEAR);
                        entries.add(ModItems.COOKED_EGG);
                        entries.add(ModItems.COKE);
                        entries.add(ModItems.STARLIGHT_ASHES);
                        entries.add(ModBlocks.MAGIC_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_LAMP);

                    }).build());





    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}