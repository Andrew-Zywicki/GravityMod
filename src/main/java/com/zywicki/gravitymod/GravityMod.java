package com.zywicki.gravitymod;

import com.zywicki.gravitymod.handler.ConfigurationHandler;
import com.zywicki.gravitymod.init.modBlocks;
import com.zywicki.gravitymod.init.modItems;
import com.zywicki.gravitymod.proxy.IProxy;
import com.zywicki.gravitymod.reference.Reference;
import com.zywicki.gravitymod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_Factory_Class)
public class GravityMod {

    @Mod.Instance("GravityMod")
    public static GravityMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        modItems.init();
        modBlocks.init();

        LogHelper.info("Preinit Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        LogHelper.info("init Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LogHelper.info("Postinit Complete");
    }
}
