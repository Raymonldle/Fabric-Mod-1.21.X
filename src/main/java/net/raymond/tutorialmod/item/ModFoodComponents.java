package net.raymond.tutorialmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .build();

    public static final FoodComponent COKE = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 0), 0.75F)
            .build();



}
