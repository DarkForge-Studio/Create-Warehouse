package com.darkforge.warehouse.content.crate;


import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
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
// Counter doesn't work
    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if(!pLevel.isClientSide && pHand == InteractionHand.MAIN_HAND) {
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            WoodenCrateBlockEntity be = new WoodenCrateBlockEntity(WOODEN_CRATE.get(),pPos,pState);
            int counter = be.incrementCouter();
            if(blockEntity instanceof WoodenCrateBlockEntity) {
                pPlayer.sendSystemMessage(Component.literal("You have clicked this number of times " + counter));
                blockEntity.setChanged();
                return InteractionResult.sidedSuccess(pLevel.isClientSide());
            }

        }
        return super.use(pState,pLevel,pPos,pPlayer,pHand,pHit);
    }
}

