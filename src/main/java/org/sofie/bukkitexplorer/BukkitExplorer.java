package org.sofie.bukkitexplorer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.sofie.bukkitexplorer.commands.MainCommand;
import org.sofie.bukkitexplorer.listeners.InventoryListener;
import org.sofie.bukkitexplorer.utils.MessageUtils;

public final class BukkitExplorer extends JavaPlugin {

    public static String prefix = "&8[&3Bukkit&aExplorer&8] » ";
    private String version = getDescription().getVersion();
    @Override
    public void onEnable() {
        registerCommands();
        registerEvents();
        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage(prefix+"&aActivando... &bVersión: &e" + version));
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage(prefix+"&cDesactivando... " + version));
    }


    // Registrar comandos y eventos
    public void registerCommands(){
        this.getCommand("bukkitexplorer").setExecutor(new MainCommand(this));
    }
    public void registerEvents(){
        getServer().getPluginManager().registerEvents(new InventoryListener(this), this);
    }
}
