package com.capstar.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.input.Keyboard;

public class Main {

    private static Minecraft mc = Minecraft.getMinecraft();
    private static boolean menuOpen = false;
    private static long lastToggle = 0;

    // این متد در هر فریم از بازی صدا زده میشه
    public static void onRender() {
        if (mc.theWorld == null || mc.thePlayer == null) return;

        ScaledResolution sr = new ScaledResolution(mc);
        int fps = Minecraft.getDebugFPS();
        int kps = Keyboard.isKeyDown(Keyboard.KEY_W) ? 100 : 0;

        // نمایش اطلاعات
        mc.fontRendererObj.drawStringWithShadow("§bCapStar Client", 5, 5, 0x00FFFF);
        mc.fontRendererObj.drawStringWithShadow("§fFPS: " + fps, 5, 15, 0xFFFFFF);
        mc.fontRendererObj.drawStringWithShadow("§fKPS: " + kps, 5, 25, 0xFFFFFF);

        // اگر منو فعاله
        if (menuOpen) {
            int centerX = sr.getScaledWidth() / 2;
            int centerY = sr.getScaledHeight() / 2;
            mc.fontRendererObj.drawStringWithShadow("§d[ CapStar Menu ]", centerX - 40, centerY - 10, 0xFF00FF);
            mc.fontRendererObj.drawStringWithShadow("§7(Shift Right برای بستن)", centerX - 50, centerY + 5, 0xAAAAAA);
        }
    }

    // این متد با فشار دادن کلید فعال میشه
    public static void onKeyPress(int key) {
        if (key == Keyboard.KEY_RSHIFT && System.currentTimeMillis() - lastToggle > 300) {
            menuOpen = !menuOpen;
            lastToggle = System.currentTimeMillis();
        }
    }
}
