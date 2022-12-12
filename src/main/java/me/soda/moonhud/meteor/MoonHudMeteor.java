package me.soda.moonhud.meteor;

import me.soda.moonhud.meteor.hud.MoonHud;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.hud.Hud;

public class MoonHudMeteor extends MeteorAddon {
    @Override
    public void onInitialize() {
        Hud.get().register(MoonHud.INFO);
    }

    @Override
    public String getPackage() {
        return "me.soda.moonhud.meteor";
    }
}
