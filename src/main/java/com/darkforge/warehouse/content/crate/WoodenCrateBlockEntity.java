package com.darkforge.warehouse.content.crate;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import static com.darkforge.warehouse.CreateWarehouse.MOD_ID;
import static com.darkforge.warehouse.infrastructure.registry.CwBlockEntityTypes.WOODEN_CRATE;


public class WoodenCrateBlockEntity extends BlockEntity{
    private int counter;

    public WoodenCrateBlockEntity(BlockEntityType<?> type, BlockPos pPos, BlockState pBlockState) {
        super(WOODEN_CRATE.get(),pPos, pBlockState);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);

        CompoundTag warehouseData = pTag.getCompound(MOD_ID);
        counter = warehouseData.getInt("Counter");
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        super.saveAdditional(pTag);

        var warehouseData = new CompoundTag();
        warehouseData.putInt("Counter", counter);
        pTag.put(MOD_ID,warehouseData);
    }

    public Integer incrementCouter(){
        return counter;
    }

    public int getCounter() {
        return counter;
    }
}
