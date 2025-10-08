package com.capstar.client.hud.modules;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class KeystrokesModule {
    public void render(Minecraft mc, int x, int y) {
        boolean w = Keyboard.isKeyDown(Keyboard.KEY_W);
        boolean a = Keyboard.isKeyDown(Keyboard.KEY_A);
        boolean s = Keyboard.isKeyDown(Keyboard.KEY_S);
        boolean d = Keyboard.isKeyDown(Keyboard.KEY_D);
        boolean space = Keyboard.isKeyDown(Keyboard.KEY_SPACE);
        boolean shift = Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT);

        String line1 = "W:" + (w? "●":"○") + " A:" + (a? "●":"○") + " S:" + (s? "●":"○") + " D:" + (d? "●":"○");
        String line2 = "Space:" + (space? "●":"○") + " Shift:" + (shift? "●":"○");
        mc.fontRendererObj.drawStringWithShadow("§cKeys: §f" + line1, x, y, 0xFFFFFF);
        mc.fontRendererObj.drawStringWithShadow("       " + line2, x, y + 10, 0xFFFFFF);
    }
}
