package com.revengance.atlantis.init;

import com.revengance.atlantis.item.ItemAtlantisMod;
import com.revengance.atlantis.item.ItemDebugger;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {


    public static final ItemAtlantisMod debugger = new ItemDebugger();

    public static void init(){
        GameRegistry.registerItem(debugger, "debugger");
    }



}
