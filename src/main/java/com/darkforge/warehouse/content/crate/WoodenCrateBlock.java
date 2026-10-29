package com.darkforge.warehouse.content.crate;


import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import static com.darkforge.warehouse.infrastructure.registry.CwBlockEntityTypes.WOODEN_CRATE;

public class WoodenCrateBlock extends Block implements EntityBlock{

    public WoodenCrateBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return WOODEN_CRATE.create(pPos,pState);
    }
}

