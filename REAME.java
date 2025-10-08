package com.capstar.client.hud.modules;

import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;

public class PingModule {
    public void render(Minecraft mc, int x, int y) {
        if (mc.getNetHandler() == null) return;
        try {
            NetHandlerPlayClient n = mc.getNetHandler();
            int ping = n.getPlayerInfo(mc.thePlayer.getName()).getResponseTime();
            mc.fontRendererObj.drawStringWithShadow("§dPing: §f" + ping + "ms", x, y, 0xFFFFFF);
        } catch (Exception e) {
            mc.fontRendererObj.drawStringWithShadow("§dPing: §fN/A", x, y, 0xFFFFFF);
        }
    }
}
