package com.darkforge.warehouse.infrastructure.registry;

import com.darkforge.warehouse.content.crate.WoodenCrateBlock;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.material.MapColor;

import static com.darkforge.warehouse.CreateWarehouse.REGISTRATE;
import static com.simibubi.create.foundation.data.TagGen.axeOnly;



public class CwBlocks {

    public static final BlockEntry<WoodenCrateBlock> WOODEN_CRATE_BLOCK = REGISTRATE.block("wooden_crate", WoodenCrateBlock::new)
            .initialProperties(SharedProperties::wooden)
            .lang("Wooden Crate")
            .transform(axeOnly())
            .properties(p ->(p.mapColor(MapColor.COLOR_ORANGE)))
            .blockstate((c,p) -> p.simpleBlock(c.get(),
                    p.models().getExistingFile(p.modLoc("block/"+ c.getName()))))
            .item()
            .model((c,p) -> p.withExistingParent(c.getName(),p.modLoc("block/" + c.getName())))
            .build()
            .register();




    public static void register(){

    }
}
