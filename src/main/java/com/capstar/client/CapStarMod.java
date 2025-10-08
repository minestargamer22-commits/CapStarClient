package com.capstar.client;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = CapStarMod.MODID, name = CapStarMod.NAME, version = CapStarMod.VERSION)
public class CapStarMod {
    public static final String MODID = "capstar";
    public static final String NAME = "CapStar Client";
    public static final String VERSION = "1.1.0";

    @SidedProxy(clientSide = "com.capstar.client.ClientProxy", serverSide = "com.capstar.client.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }
}
