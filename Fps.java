package com.capstar.client.hud.modules;

import net.minecraft.client.Minecraft;

public class FPSModule {
    private long lastTime = System.nanoTime();
    private int frames = 0;
    private int lastFps = 0;

    public void render(Minecraft mc, int x, int y) {
        frames++;
        long now = System.nanoTime();
        if (now - lastTime >= 1_000_000_000L) {
            lastFps = frames;
            frames = 0;
            lastTime = now;
        }
        if (lastFps > 100) lastFps = 100;
        mc.fontRendererObj.drawStringWithShadow("§cFPS: §f" + lastFps, x, y, 0xFFFFFF);
    }
}
