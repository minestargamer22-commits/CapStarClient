package com.capstar.client.hud;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import com.capstar.client.hud.modules.FPSModule;
import com.capstar.client.hud.modules.CPSModule;
import com.capstar.client.hud.modules.KeystrokesModule;
import com.capstar.client.hud.modules.PingModule;
import com.capstar.client.hud.modules.TimeModule;
import com.capstar.client.ClientState;

public class HUDRenderer {
    private FPSModule fps = new FPSModule();
    private CPSModule cps = new CPSModule();
    private KeystrokesModule keys = new KeystrokesModule();
    private PingModule ping = new PingModule();
    private TimeModule time = new TimeModule();

    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent.Text event) {
        Minecraft mc = Minecraft.getMinecraft();
        int x = 8;
        int y = 8;
        if (ClientState.isEnabled("fps")) { fps.render(mc, x, y); y += 12; }
        if (ClientState.isEnabled("cps")) { cps.render(mc, x, y); y += 12; }
        if (ClientState.isEnabled("keys")) { keys.render(mc, x, y); y += 24; }
        if (ClientState.isEnabled("ping")) { ping.render(mc, x, y); y += 12; }
        if (ClientState.isEnabled("time")) { time.render(mc, x, y); y += 12; }
    }
                                                         }
