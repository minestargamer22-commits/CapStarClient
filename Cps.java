package com.capstar.client.hud.modules;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import java.util.ArrayDeque;

public class CPSModule {
    private ArrayDeque<Long> clicks = new ArrayDeque<>();
    private boolean lastDown = false;

    public void render(Minecraft mc, int x, int y) {
        boolean down = Mouse.isButtonDown(0);
        long now = System.currentTimeMillis();
        if (down && !lastDown) {
            clicks.addLast(now);
        }
        lastDown = down;
        long cutoff = System.currentTimeMillis() - 1000;
        while (!clicks.isEmpty() && clicks.peekFirst() < cutoff) clicks.removeFirst();
        int cps = clicks.size();
        if (cps > 100) cps = 100;
        mc.fontRendererObj.drawStringWithShadow("§5CPS: §f" + cps, x, y, 0xFFFFFF);
    }
}
