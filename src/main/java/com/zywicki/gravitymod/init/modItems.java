package com.zywicki.gravitymod.init;

import com.zywicki.gravitymod.item.ItemGravity;
import com.zywicki.gravitymod.item.ItemGravityCore;
import cpw.mods.fml.common.registry.GameRegistry;

public class modItems {

    public static final ItemGravity gravityCore =  new ItemGravityCore();

    public static void init(){

        GameRegistry.registerItem(gravityCore, "Gravity_Core");

    }
}
