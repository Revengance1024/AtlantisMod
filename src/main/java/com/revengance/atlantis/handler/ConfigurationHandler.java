package com.revengance.atlantis.handler;

import com.revengance.atlantis.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static boolean devMode = false;

    public static void init(File configFile){
        if(configuration == null){
            configuration = new Configuration(configFile);
            loadConfiguration();
        }


    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            loadConfiguration();
        }
    }

    private static void loadConfiguration(){

        devMode = configuration.getBoolean(Configuration.CATEGORY_GENERAL, "devMode", false, "Enables developer mode.");

        if(configuration.hasChanged()){
            configuration.save();
        }

    }
}
