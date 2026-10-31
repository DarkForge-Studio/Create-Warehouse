package com.darkforge.warehouse.content.crate;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;

import static com.darkforge.warehouse.CreateWarehouse.MOD_ID;
import static com.darkforge.warehouse.infrastructure.registry.CwBlockEntityTypes.WOODEN_CRATE;


public class WoodenCrateBlockEntity extends BlockEntity{

    public final int slotCount = 27;

    public final ItemStackHandler inventory = new ItemStackHandler(slotCount){
        @Override
        protected void onContentsChanged(int slot) {
            super.onContentsChanged(slot);
            WoodenCrateBlockEntity.this.setChanged();
        }
    };
    private final LazyOptional<ItemStackHandler> optional = LazyOptional.of(() -> this.inventory); //this might have the key for 256 stacks

    public WoodenCrateBlockEntity(BlockEntityType<?> type, BlockPos pPos, BlockState pBlockState) {
        super(WOODEN_CRATE.get(),pPos, pBlockState);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        optional.invalidate();
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        CompoundTag warehouseData = pTag.getCompound(MOD_ID);
        this.inventory.deserializeNBT(warehouseData);
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        super.saveAdditional(pTag);
        var warehouseData = new CompoundTag();
        pTag.put(MOD_ID,warehouseData);
        warehouseData.put("Inventory" , inventory.serializeNBT());
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap) { //this is so that other mods can be notified about our capabilities
        return cap == ForgeCapabilities.ITEM_HANDLER ? this.optional.cast() : super.getCapability(cap);
    }
}
