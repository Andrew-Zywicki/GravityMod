package com.zywicki.gravitymod.init;

import com.zywicki.gravitymod.block.BlockGravity;
import com.zywicki.gravitymod.block.BlockSingularity;
import cpw.mods.fml.common.registry.GameRegistry;

public class modBlocks {

    public static final BlockGravity singularity =  new BlockSingularity();

    public static void init(){

        GameRegistry.registerBlock(singularity, "Singularity");

    }

}
