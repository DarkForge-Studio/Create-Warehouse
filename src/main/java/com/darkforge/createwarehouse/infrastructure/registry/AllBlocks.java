package com.darkforge.createwarehouse.infrastructure.registry;

import com.darkforge.createwarehouse.content.crate.CrateBlock;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;

import static com.darkforge.createwarehouse.CreateWarehouse.REGISTRATE;
import static com.simibubi.create.foundation.data.TagGen.axeOnly;



public class AllBlocks {

    public static final BlockEntry<CrateBlock> WOODEN_CRATE_BLOCK = REGISTRATE.block("wooden_crate", CrateBlock::new)
            .initialProperties(SharedProperties::wooden)
            .lang("Wooden Crate")
            .transform(axeOnly())
            .blockstate((c,p) -> p.simpleBlock(c.get(),
                    p.models().getExistingFile(p.modLoc("block/"+ c.getName()))))
            .item()
            .model((c,p) -> p.withExistingParent(c.getName(),p.modLoc("block/" + c.getName())))
            .build()
            .register();




    public static void register(){

    }
}
