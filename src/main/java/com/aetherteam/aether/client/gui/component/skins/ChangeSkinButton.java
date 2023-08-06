package com.aetherteam.aether.client.gui.component.skins;

import com.aetherteam.aether.client.gui.screen.perks.MoaSkinsScreen;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.renderer.GameRenderer;

public class ChangeSkinButton extends Button {
    private final ButtonType buttonType;

    public ChangeSkinButton(ButtonType buttonType, Builder builder) {
        super(builder);
        this.buttonType = buttonType;
        this.active = false;
    }

    public void onPress() {
        if (this.isActive()) {
            this.onPress.onPress(this);
        }
    }

    @Override
    public void renderWidget(PoseStack poseStack, int mouseX, int mouseY, float partialTicks) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderTexture(0, MoaSkinsScreen.MOA_SKINS_GUI);
        int u = 0;
        if (this.buttonType == ButtonType.REMOVE) {
            u += 3;
        }
        if (this.isActive()) {
            u += 1;
            if (this.isHovered()) {
                u += 1;
            }
        }
        GuiComponent.blit(poseStack, this.getX(), this.getY(), u * 7, 184, 7, 7);
    }

    public enum ButtonType {
        APPLY,
        REMOVE
    }
}
