package com.darkforge.createwarehouse;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AllCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,CreateWarehouse.MOD_ID);

public static final RegistryObject<CreativeModeTab> BASE_CREATIVE_TAB = REGISTER.register("base", () -> CreativeModeTab.builder().build());

    public static void register(IEventBus modEventBus){
        REGISTER.register(modEventBus);
    }
}
