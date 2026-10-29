package com.darkforge.warehouse.infrastructure.registry;

import com.darkforge.warehouse.CreateWarehouse;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CwCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateWarehouse.MOD_ID);

public static final RegistryObject<CreativeModeTab> BASE_CREATIVE_TAB = REGISTER.register("base", () -> CreativeModeTab.builder()
        .icon(CwBlocks.WOODEN_CRATE_BLOCK::asStack)
        .title(Component.translatable("creativetab.warehouse_tab"))
        .displayItems(((pParameters, pOutput) -> {
            pOutput.accept(com.darkforge.warehouse.infrastructure.registry.CwBlocks.WOODEN_CRATE_BLOCK);
        }))
        .build());

    public static void register(IEventBus modEventBus){
        REGISTER.register(modEventBus);
    }
}
