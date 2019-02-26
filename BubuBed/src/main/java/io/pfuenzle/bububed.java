package io.pfuenzle;

import org.bukkit.plugin.java.JavaPlugin;

public final class bububed extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Lade BubuBed");
        getServer().getPluginManager().registerEvents(new BedListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Entlade BubuBed");
    }
}
