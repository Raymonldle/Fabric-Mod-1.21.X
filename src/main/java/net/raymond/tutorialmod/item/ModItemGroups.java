package net.raymond.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.raymond.tutorialmod.TutorialMod;
import net.raymond.tutorialmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                            entries.add(ModItems.PINK_GARNET);
                            entries.add(ModItems.RAW_PINK_GARNET);
                            entries.add(ModBlocks.PINK_GARNET_BLOCK);
                            entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                    }).build());

    public static final ItemGroup ALEXANDRITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "alexandrite_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE))
                    .displayName(Text.translatable("itemgroup.tutorialmod.alexandrite_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ALEXANDRITE);
                        entries.add(ModItems.RAW_ALEXANDRITE);
                        entries.add(ModBlocks.ALEXANDRITE_BLOCK);
                        entries.add(ModBlocks.RAW_ALEXANDRITE_BLOCK);
                    }).build());

    public static final ItemGroup BISMUTH_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "bismuth_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BISMUTH))
                    .displayName(Text.translatable("itemgroup.tutorialmod.bismuth_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BISMUTH);
                        entries.add(ModItems.RAW_BISMUTH);
                        entries.add(ModBlocks.BISMUTH_BLOCK);
                        entries.add(ModBlocks.RAW_BISMUTH_BLOCK );
                    }).build());


    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
