package com.darkforge.warehouse.content.crate;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import static com.darkforge.warehouse.infrastructure.registry.CwBlockEntityTypes.WOODEN_CRATE;


public class WoodenCrateBlockEntity extends BlockEntity{

    public WoodenCrateBlockEntity(BlockEntityType<?> type, BlockPos pPos, BlockState pBlockState) {
        super(WOODEN_CRATE.get(),pPos, pBlockState);
    }
}
