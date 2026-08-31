package com.darkforge.createwarehouse;

import com.darkforge.createwarehouse.content.crate.CrateBlock;
import com.mojang.logging.LogUtils;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import org.slf4j.Logger;

import static com.darkforge.createwarehouse.CreateWarehouse.REGISTRATE;

public class AllBlocks {
    public static final String MOD_ID = "create_warehouse";
    public static final String NAME = "Create: Warehouse";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final BlockEntry<CrateBlock> CRATE_BLOCK = REGISTRATE.block("crate", CrateBlock::new).register();




    public static void register(){

    }
}
