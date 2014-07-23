package com.revengance.atlantis;

import com.revengance.atlantis.handler.ConfigurationHandler;
import com.revengance.atlantis.init.ModBlocks;
import com.revengance.atlantis.init.ModItems;
import com.revengance.atlantis.proxy.IProxy;
import com.revengance.atlantis.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY)
public class Atlantis {

    @Mod.Instance(Reference.MOD_ID)
    public static Atlantis instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void preInit(FMLPostInitializationEvent event){

    }


}
