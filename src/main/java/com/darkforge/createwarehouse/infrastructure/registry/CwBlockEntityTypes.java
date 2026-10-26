package com.darkforge.createwarehouse.infrastructure.registry;

import com.darkforge.createwarehouse.content.crate.WoodenCrateBlockEntity;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

import static com.darkforge.createwarehouse.CreateWarehouse.REGISTRATE;

public class CwBlockEntityTypes {

    public static final BlockEntityEntry<WoodenCrateBlockEntity> WOODEN_CRATE = REGISTRATE.blockEntity("wooden_crate_block_entity", WoodenCrateBlockEntity::new)
            .validBlock(CwBlocks.WOODEN_CRATE_BLOCK)
            .register();

    public static void register(){

    }
}
