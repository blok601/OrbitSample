package me.blok.orbit;

import me.blok.orbit.command.ExplodeCommand;
import me.blok.orbit.command.FireCommand;
import me.blok.orbit.command.LightningCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Orbit extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void registerCommands() {
        getCommand("fire").setExecutor(new FireCommand());
        getCommand("lightning").setExecutor(new LightningCommand());
        getCommand("explode").setExecutor(new ExplodeCommand());
    }
}
