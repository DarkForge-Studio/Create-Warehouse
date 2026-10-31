package com.darkforge.warehouse.content.crate;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;

public class WoodenCrateMenu extends AbstractContainerMenu {

    public WoodenCrateMenu(MenuType<WoodenCrateMenu> menuType, int containerId){
        super(menuType,containerId);
    }
    @Override
    public ItemStack quickMoveStack(Player pPlayer, int pIndex) {
        return null;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return false;
    }
}
