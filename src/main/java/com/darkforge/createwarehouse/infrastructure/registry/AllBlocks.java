package com.darkforge.createwarehouse.infrastructure.registry;

import com.darkforge.createwarehouse.content.crate.CrateBlock;
import com.tterrag.registrate.util.entry.BlockEntry;
import static com.darkforge.createwarehouse.CreateWarehouse.REGISTRATE;


public class AllBlocks {

    public static final BlockEntry<CrateBlock> CRATE_BLOCK = REGISTRATE.block("crate", CrateBlock::new)
            .simpleItem()
            .register();




    public static void register(){

    }
}
