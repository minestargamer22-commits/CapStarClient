package com.capstar.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.Minecraft;
import java.io.IOException;
import com.capstar.client.ClientState;

public class CapStarGui extends GuiScreen {
    private final int WIDTH = 480;
    private final int HEIGHT = 280;

    @Override
    public void initGui() {
        this.buttonList.clear();
        int cx = (this.width - WIDTH) / 2;
        int cy = (this.height - HEIGHT) / 2;
        int bx = cx + 20;
        int by = cy + 50;
        int w = 180;
        int h = 28;

        this.buttonList.add(new GuiButton(1, bx, by, w, h, "FPS"));
        this.buttonList.add(new GuiButton(2, bx, by + 36, w, h, "CPS"));
        this.buttonList.add(new GuiButton(3, bx, by + 72, w, h, "Keystrokes"));
        this.buttonList.add(new GuiButton(4, bx + 220, by, w, h, "Ping"));
        this.buttonList.add(new GuiButton(5, bx + 220, by + 36, w, h, "Time"));
        this.buttonList.add(new GuiButton(100, cx + WIDTH - 100, cy + HEIGHT - 40, 80, 24, "Close"));
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        super.actionPerformed(button);
        switch (button.id) {
            case 1: ClientState.toggle("fps"); break;
            case 2: ClientState.toggle("cps"); break;
            case 3: ClientState.toggle("keys"); break;
            case 4: ClientState.toggle("ping"); break;
            case 5: ClientState.toggle("time"); break;
            case 100: this.mc.displayGuiScreen(null); break;
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        int cx = (this.width - WIDTH) / 2;
        int cy = (this.height - HEIGHT) / 2;

        // بک‌گراند تیره با لبهٔ رنگی (قرمز-بنفش)
        this.drawRect(cx, cy, cx + WIDTH, cy + HEIGHT, 0xCC0C0C10);
        // بالای منو عنوان
        this.drawCenteredString(this.fontRendererObj, "§c§lCapStar Client §5v1.1", this.width / 2, cy + 8, 0xFFFFFF);
        // خطوط جداکننده ساده (برای استایل CM)
        this.drawHorizontalLine(cx + 10, cx + WIDTH - 10, cy + 32, 0xFF8800FF);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
                                }
