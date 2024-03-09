package org.sofie.bukkitexplorer.listeners;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.sofie.bukkitexplorer.BukkitExplorer;
import org.sofie.bukkitexplorer.utils.MessageUtils;


public class InventoryListener implements Listener {

    private BukkitExplorer plugin;
    public InventoryListener(BukkitExplorer plugin) {
        this.plugin = plugin;
    }


    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){


        Inventory clickedInventory = event.getClickedInventory();
        if (clickedInventory == null) return; // Si el inventario clickeado es null, retornar

        InventoryHolder holder = clickedInventory.getHolder();
        if (!(holder instanceof Player)) return; // Si el holder no es un jugador, retornar

        Player player = (Player) holder;
        player.sendMessage(MessageUtils.getColoredMessage(BukkitExplorer.prefix + "&bHas abierto un inventario"));

        // Verificar si el inventario clickeado es el inventario abierto superior del jugador
        if (clickedInventory.equals(event.getView().getTopInventory())) {
            // Cancelar el evento para evitar que el jugador mueva los ítems dentro del inventario
            event.setCancelled(true);
            player.sendMessage(MessageUtils.getColoredMessage(BukkitExplorer.prefix + "&cSe ha cancelau"));
        }
    }

}
