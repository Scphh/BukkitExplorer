package org.sofie.bukkitexplorer.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
import org.sofie.bukkitexplorer.utils.MessageUtils;

public class InventoryManager {

    public Inventory mainInventory() {
        Inventory menuPrincipal = Bukkit.createInventory(null, 27, "Menú principal");

        ItemStack desafio1 = new ItemStack(Material.GOLD_BLOCK, 1);
        ItemMeta meta1 = desafio1.getItemMeta();
        meta1.setDisplayName(MessageUtils.getColoredMessage("&e1. Registrar evento básico"));
        desafio1.setItemMeta(meta1);
        menuPrincipal.setItem(0, desafio1);

        ItemStack desafio2 = new ItemStack(Material.SPLASH_POTION, 1);
        ItemMeta meta2 = desafio2.getItemMeta();
        meta2.setDisplayName(MessageUtils.getColoredMessage("&b2. Creación de efectos especiales"));
        desafio2.setItemMeta(meta2);
        menuPrincipal.setItem(1, desafio2);

        ItemStack desafio3 = new ItemStack(Material.COMMAND_BLOCK, 1);
        ItemMeta meta3 = desafio3.getItemMeta();
        meta3.setDisplayName(MessageUtils.getColoredMessage("&c3. Creación de comandos personalizados"));
        desafio3.setItemMeta(meta3);
        menuPrincipal.setItem(2, desafio3);

        ItemStack desafio4 = new ItemStack(Material.ZOMBIE_HEAD, 1);
        ItemMeta meta4 = desafio4.getItemMeta();
        meta4.setDisplayName(MessageUtils.getColoredMessage("&a4. Creación de entidades personalizadas"));
        desafio4.setItemMeta(meta4);
        menuPrincipal.setItem(3, desafio4);

        ItemStack desafio5 = new ItemStack(Material.GOLD_NUGGET, 1);
        ItemMeta meta5 = desafio5.getItemMeta();
        meta5.setDisplayName(MessageUtils.getColoredMessage("&65. Integración con economía"));
        desafio5.setItemMeta(meta5);
        menuPrincipal.setItem(4, desafio5);

        ItemStack desafio6 = new ItemStack(Material.REPEATING_COMMAND_BLOCK, 1);
        ItemMeta meta6 = desafio6.getItemMeta();
        meta6.setDisplayName(MessageUtils.getColoredMessage("&56. Gestión de permisos"));
        desafio6.setItemMeta(meta6);
        menuPrincipal.setItem(5, desafio6);

        ItemStack desafio7 = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta7 = desafio7.getItemMeta();
        meta7.setDisplayName(MessageUtils.getColoredMessage("&b7. Manejo de eventos de combate"));
        desafio7.setItemMeta(meta7);
        menuPrincipal.setItem(6, desafio7);

        ItemStack desafio8 = new ItemStack(Material.CAULDRON, 1);
        ItemMeta meta8 = desafio8.getItemMeta();
        meta8.setDisplayName(MessageUtils.getColoredMessage("&88. Integración con archivos de config. y BD"));
        desafio8.setItemMeta(meta8);
        menuPrincipal.setItem(7, desafio8);

        ItemStack desafio9 = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta meta9 = desafio9.getItemMeta();
        meta9.setDisplayName(MessageUtils.getColoredMessage("&f9. Manejo de mundos"));
        desafio9.setItemMeta(meta9);
        menuPrincipal.setItem(8, desafio9);

        ItemStack desafio10 = new ItemStack(Material.ENDER_EYE, 1);
        ItemMeta meta10 = desafio10.getItemMeta();
        meta10.setDisplayName(MessageUtils.getColoredMessage("&a10. Manejo de APIs"));
        desafio10.setItemMeta(meta10);
        menuPrincipal.setItem(9, desafio10);


        return menuPrincipal;
    }



}
