package com.darkforge.createwarehouse.infrastructure.registry;

import com.darkforge.createwarehouse.content.crate.CrateBlock;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;

import static com.darkforge.createwarehouse.CreateWarehouse.REGISTRATE;


public class AllBlocks {

    public static final RegistryEntry<CrateBlock> CRATE_BLOCK = REGISTRATE.block("crate", CrateBlock::new).register();




    public static void register(){

    }
}
