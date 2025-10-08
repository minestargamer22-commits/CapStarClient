package com.capstar.client;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;
import com.capstar.client.hud.HUDRenderer;

public class ClientProxy extends CommonProxy {
    public static Keybinds keybinds;

    @Override
    public void init() {
        keybinds = new Keybinds();
        keybinds.register();
        MinecraftForge.EVENT_BUS.register(new HUDRenderer());
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void clientTick(TickEvent.ClientTickEvent event) {
        if (Minecraft.getMinecraft().theWorld == null) return;
        if (keybinds.openMenu.isPressed()) {
            Minecraft.getMinecraft().displayGuiScreen(new com.capstar.client.gui.CapStarGui());
        }
    }
}
