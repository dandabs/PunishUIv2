package net.danielonline.pui;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CreditCommand extends JavaPlugin
{
  public static void showCredit(Player p)
  {
    ChatColor cm = ChatColor.RED;
    ChatColor cs = ChatColor.GOLD;

    p.sendMessage(cs + "-===-===-" + cm + "-===-===-");
    p.sendMessage(cs + "PunishUIv2 Credits");
    p.sendMessage(cm + "-===-===-" + cs + "-===-===-");
    p.sendMessage(cm + "Written by:" + cs + "DevDan");
    p.sendMessage(cs + "-===-===-" + cm + "-===-===-");
    p.sendMessage(cm + "A big thanks to" + cs + " Helpin " + cm + " for suggesting to add " + cs + "punish times and commands" + cm + " to the " + cs + "config file" + cm + " =D");
    p.sendMessage(cm + "Thanks to" + cs + " OokieMonsterMC " + cm + " for helping me to test " + cs + "PunishUI " + cm + " :)");
    p.sendMessage(cm + "A massive thanks to" + cs + " ZytexMC & TurtleLord_57 " + cm + " for helping me to train the new staff on my server! <3");
    p.sendMessage(cm + "-===-===-" + cs + "-===-===-");
  }
}