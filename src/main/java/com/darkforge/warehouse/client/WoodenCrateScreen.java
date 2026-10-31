package com.darkforge.warehouse.client;

import com.darkforge.warehouse.content.crate.WoodenCrateMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

public class WoodenCrateScreen extends AbstractContainerScreen<WoodenCrateMenu> {

    //this is what client renders
    public WoodenCrateScreen(WoodenCrateMenu menu, Inventory inventory, Component component){
        super(menu,inventory,component);

    }
    @Override
    protected void renderBg(GuiGraphics pGuiGraphics, float pPartialTick, int pMouseX, int pMouseY) {

    }
}
