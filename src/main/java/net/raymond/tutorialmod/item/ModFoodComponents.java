package net.raymond.tutorialmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.4f)
            .build();

    public static final FoodComponent COKE = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 150, 3), 0.75F)
            .build();

    public static final FoodComponent COOKED_EGG = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(0.6f)
            .build();

    public static final FoodComponent PEAR = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.4f)
            .build();
    public static final FoodComponent BROCCOLI = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .snack()
            .build();
}
