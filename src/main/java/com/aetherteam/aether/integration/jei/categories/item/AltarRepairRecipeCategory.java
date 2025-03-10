package com.aetherteam.aether.integration.jei.categories.item;

import com.aetherteam.aether.Aether;
import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.recipe.recipes.item.AltarRepairRecipe;
import com.mojang.blaze3d.vertex.PoseStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public class AltarRepairRecipeCategory extends AbstractAetherCookingRecipeCategory<AltarRepairRecipe> implements IRecipeCategory<AltarRepairRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(Aether.MODID, "repairing");
    public static final ResourceLocation TEXTURE = new ResourceLocation(Aether.MODID, "textures/gui/menu/altar.png");
    public static final RecipeType<AltarRepairRecipe> RECIPE_TYPE = RecipeType.create(Aether.MODID, "repairing", AltarRepairRecipe.class);

    public AltarRepairRecipeCategory(IGuiHelper guiHelper) {
        super("altar.repairing", UID,
                guiHelper.createDrawable(TEXTURE, 55, 16, 82, 54),
                guiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(AetherBlocks.ALTAR.get())),
                guiHelper.createDrawable(TEXTURE, 176, 0, 14, 13),
                guiHelper.createAnimatedDrawable(guiHelper.createDrawable(TEXTURE, 176, 14, 23, 16), 100, IDrawableAnimated.StartDirection.LEFT, false),
                RECIPE_TYPE);
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, AltarRepairRecipe recipe, IFocusGroup focusGroup) {
        NonNullList<Ingredient> recipeIngredients = recipe.getIngredients();

        ItemStack damagedItem = recipeIngredients.get(0).getItems()[0].copy();
        damagedItem.setDamageValue(damagedItem.getMaxDamage() * 3 / 4);

        builder.addSlot(RecipeIngredientRole.INPUT, 1, 1).addIngredients(Ingredient.of(damagedItem));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 61, 19).addItemStack(recipe.getResult());
    }

    @Override
    public void draw(AltarRepairRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        this.animatedProgressArrow.draw(stack, 24, 18);
        this.fuelIndicator.draw(stack, 1, 20);
        this.drawExperience(recipe, stack, 1, this.background);
        this.drawCookingTime(stack, 45, recipe.getCookingTime(), this.background);
    }
}
