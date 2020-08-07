package net.danielonline.pui;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class InfoCommand extends JavaPlugin
{
  public static void pluginInfo(String[] args, Player sender)
  {
    Player p = sender;
    ChatColor cm = ChatColor.RED;
    ChatColor cs = ChatColor.GOLD;
    ChatColor ct = ChatColor.GREEN;

    if (args.length == 0)
    {
      p.sendMessage(cs + "-===-===-" + cm + "-===-===-");
      p.sendMessage(cs + "PunishUIv2");
      p.sendMessage(cm + "-===-===-" + cs + "-===-===-");
      p.sendMessage(cm + "Written by:" + cs + "DevDan");
      p.sendMessage(cs + "-===-===-" + cm + "-===-===-");
      p.sendMessage(cm + "Type " + cs + "/pui help" + cm + " for help with commands.");
      p.sendMessage(cm + "-===-===-" + cs + "-===-===-");
    }
    else if (args.length == 1)
    {
      if (args[0] == "help")
      {
        p.sendMessage(cm + "PunishUI help is also avaliable at:");
        p.sendMessage(ct + "https://dev.bukkit.org/projects/punishuiv2");
        p.chat("/help PunishUI");
      }
      else {
        p.sendMessage(cs + "-===-===-" + cm + "-===-===-");
        p.sendMessage(cs + "PunishUIv2");
        p.sendMessage(cm + "-===-===-" + cs + "-===-===-");
        p.sendMessage(cm + "Written by:" + cs + "DevDan");
        p.sendMessage(cs + "-===-===-" + cm + "-===-===-");
        p.sendMessage(cm + "Type " + cs + "/pui help" + cm + " for help with commands.");
        p.sendMessage(cm + "-===-===-" + cs + "-===-===-");
      }

    }

    if ((args.length != 0) && (args.length != 1))
    {
      p.sendMessage(cm + "Use either" + cs + " zero " + cm + "arguments or" + cs + " one " + cm + "argument.");
    }
  }
}