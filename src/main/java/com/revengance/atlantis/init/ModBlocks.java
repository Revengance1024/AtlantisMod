package com.revengance.atlantis.init;

import com.revengance.atlantis.block.BlockAtlantisMod;
import com.revengance.atlantis.block.BlockDebugStation;
import com.revengance.atlantis.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockAtlantisMod debugStation = new BlockDebugStation();

    public static void init(){
        GameRegistry.registerBlock(debugStation, "debugStation");
    }
}
