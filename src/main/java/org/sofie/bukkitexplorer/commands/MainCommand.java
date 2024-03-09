package org.sofie.bukkitexplorer.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.sofie.bukkitexplorer.BukkitExplorer;
import org.sofie.bukkitexplorer.inventories.InventoryManager;
import org.sofie.bukkitexplorer.utils.MessageUtils;

public class MainCommand implements CommandExecutor {

    private BukkitExplorer plugin;
    public MainCommand(BukkitExplorer plugin){
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {

        if (!(sender instanceof Player)){
            sender.sendMessage(MessageUtils.getColoredMessage(BukkitExplorer.prefix + "&cError: Este comando no se puede ejecutar desde la consola."));
            return false;
        }

        Player player = (Player) sender;

        Inventory menu = new InventoryManager().mainInventory();
        player.openInventory(menu);

        return false;
    }
}
