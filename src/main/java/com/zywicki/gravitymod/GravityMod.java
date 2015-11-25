package com.zywicki.gravitymod;

import com.zywicki.gravitymod.proxy.IProxy;
import com.zywicki.gravitymod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class GravityMod {

    @Mod.Instance("GravityMod")
    public static GravityMod instance;

    @SidedProxy(clientSide = "com.zywicki.gravitymod.proxy.ClientProxy", serverSide = "com.zywicki.gravitymod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
