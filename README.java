package com.capstar.client;

import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class Keybinds {
    public KeyBinding openMenu;

    public Keybinds() {
        openMenu = new KeyBinding("Open CapStar Menu", Keyboard.KEY_RSHIFT, "CapStar");
    }

    public void register() {
        ClientRegistry.registerKeyBinding(openMenu);
    }
}
