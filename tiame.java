package com.capstar.client.hud.modules;

import net.minecraft.client.Minecraft;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeModule {
    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");

    public void render(Minecraft mc, int x, int y) {
        String t = LocalTime.now().format(fmt);
        mc.fontRendererObj.drawStringWithShadow("§6Time: §f" + t, x, y, 0xFFFFFF);
    }
}
