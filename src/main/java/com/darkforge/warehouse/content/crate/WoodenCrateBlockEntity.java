package com.darkforge.warehouse.content.crate;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.wrapper.CombinedInvWrapper;

import static com.darkforge.warehouse.CreateWarehouse.MOD_ID;
import static com.darkforge.warehouse.infrastructure.registry.CwBlockEntityTypes.WOODEN_CRATE;


public class WoodenCrateBlockEntity extends BlockEntity{

    public static final int slotCount = 27;

    public static final ItemStackHandler inventory = new ItemStackHandler(slotCount);
    private final LazyOptional<IItemHandler> optional = LazyOptional.of();

    public WoodenCrateBlockEntity(BlockEntityType<?> type, BlockPos pPos, BlockState pBlockState) {
        super(WOODEN_CRATE.get(),pPos, pBlockState);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);

        CompoundTag warehouseData = pTag.getCompound(MOD_ID);
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        super.saveAdditional(pTag);

        var warehouseData = new CompoundTag();
        pTag.put(MOD_ID,warehouseData);


    }

}
