package net.raymond.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.raymond.tutorialmod.TutorialMod;
import net.raymond.tutorialmod.item.custom.ChiselItem;

import java.util.List;

public class ModItems {

    //ADDING ITEMS
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    public static final Item BISMUTH = registerItem("bismuth", new Item(new Item.Settings()));
    public static final Item RAW_BISMUTH = registerItem("raw_bismuth", new Item(new Item.Settings()));

    public static final Item ALEXANDRITE = registerItem("alexandrite", new Item(new Item.Settings()));
    public static final Item RAW_ALEXANDRITE = registerItem("raw_alexandrite", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));


    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFLOWER)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.tutorialmod.cauliflower.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item PEAR = registerItem("pear", new Item(new Item.Settings().food(ModFoodComponents.PEAR)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.tutorialmod.pear.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item COKE = registerItem("coke", new Item(new Item.Settings().food(ModFoodComponents.COKE)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.tutorialmod.coke.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item COOKED_EGG = registerItem("cooked_egg", new Item(new Item.Settings().food(ModFoodComponents.COOKED_EGG)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.tutorialmod.cooked_egg.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item BROCCOLI = registerItem("broccoli", new Item(new Item.Settings().food(ModFoodComponents.BROCCOLI)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.tutorialmod.broccoli.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });



    

    public static final Item STARLIGHT_ASHES = registerItem("starlight_ashes", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
        });
    }
}
