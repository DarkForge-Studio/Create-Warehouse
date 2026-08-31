package com.darkforge.createwarehouse.content.crate;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CrateBlock extends Block{

    public CrateBlock(BlockBehaviour.Properties pProperties){
        super(pProperties
                .sound(SoundType.WOOD)
                .strength(3.5F));
    }

}
