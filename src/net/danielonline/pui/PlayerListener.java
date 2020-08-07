package net.danielonline.pui;

import java.util.Objects;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class PlayerListener
  implements Listener
{
  @EventHandler
  public void onClick(InventoryClickEvent e)
  {
    Player p = (Player)e.getWhoClicked();

    if (e.getInventory().getTitle().equals(PunishUI.sui.getTitle()))
    {
      if (e.getSlot() == 13)
      {
        e.setCancelled(true);
        p.closeInventory();
        PunishUI.openPunish(p);
      }

      if (e.getSlot() == 22)
      {
        e.setCancelled(true);
        p.closeInventory();
        PunishUI.openTools(p);
      }
      
      if (e.getInventory().getTitle().equals(PunishUI.msui.getTitle()))
      {
        if (e.getSlot() == 13)
        {
          e.setCancelled(true);
          p.closeInventory();
          PunishUI.openMute(p);
        }

        if (e.getSlot() == 22)
        {
          e.setCancelled(true);
          p.closeInventory();
          PunishUI.openTools(p);
        }

    }

    if (e.getInventory().getTitle().equals(PunishUI.tui.getTitle()))
    {
      if (e.getSlot() == 2)
      {
        p.chat("/" + PunishUI.cnf_checkban + " " + PunishUI.pn);
        e.setCancelled(true);
        p.closeInventory();
      }

      if (e.getSlot() == 4)
      {
        p.chat("/" + PunishUI.cnf_dupeip + " " + PunishUI.pn);
        e.setCancelled(true);
        p.closeInventory();
      }

      if (e.getSlot() == 6)
      {
        p.chat("/" + PunishUI.cnf_uuid + " " + PunishUI.pn);
        e.setCancelled(true);
        p.closeInventory();
      }

    }

    if (e.getInventory().getTitle().equals(PunishUI.pui.getTitle()))
    {
      if (e.getSlot() == 4)
      {
        e.setCancelled(true);
        p.closeInventory();
      }

      if (e.getSlot() == 9)
      {
        e.setCancelled(true);
        p.closeInventory();

        p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "hacking" + ChatColor.RED + ".");

        if (Objects.equals("perm", PunishUI.cnf_hacking_cmd))
        {
          p.chat("/" + PunishUI.cnf_ban + PunishUI.pn + " Hacking.");
        }

        if (Objects.equals("kick", PunishUI.cnf_hacking_cmd))
        {
          p.chat("/" + PunishUI.cnf_kick + PunishUI.pn + " Hacking.");
        }

        if (Objects.equals("mute", PunishUI.cnf_hacking_cmd))
        {
          p.chat("/" + PunishUI.cnf_mute + " " + PunishUI.pn + " Hacking.");
        }

        if (Objects.equals("warn", PunishUI.cnf_hacking_cmd))
        {
          p.chat("/" + PunishUI.cnf_warn + " " + PunishUI.pn + " Hacking.");
        }

        if (Objects.equals("tempban", PunishUI.cnf_hacking_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempban + " " + PunishUI.pn + " " + PunishUI.cnf_hacking_length + " " + PunishUI.cnf_hacking_form + " Hacking.");
        }

        if (Objects.equals("tempmute", PunishUI.cnf_hacking_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempmute + " " + PunishUI.pn + " " + PunishUI.cnf_hacking_length + " " + PunishUI.cnf_hacking_form + " Hacking.");
        }

      }

      if (e.getSlot() == 10)
      {
        e.setCancelled(true);
        p.closeInventory();

        p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "abusing their powers" + ChatColor.RED + ".");

        if (Objects.equals("perm", PunishUI.cnf_abuse_cmds_cmd))
        {
          p.chat("/" + PunishUI.cnf_ban + PunishUI.pn + " Chat related..");
        }

        if (Objects.equals("kick", PunishUI.cnf_abuse_cmds_cmd))
        {
          p.chat("/" + PunishUI.cnf_kick + PunishUI.pn + " Chat related..");
        }

        if (Objects.equals("mute", PunishUI.cnf_abuse_cmds_cmd))
        {
          p.chat("/" + PunishUI.cnf_mute + " " + PunishUI.pn + " Chat related..");
        }

        if (Objects.equals("warn", PunishUI.cnf_abuse_cmds_cmd))
        {
          p.chat("/" + PunishUI.cnf_warn + " " + PunishUI.pn + " Chat related..");
        }

        if (Objects.equals("tempban", PunishUI.cnf_abuse_cmds_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempban + " " + PunishUI.pn + " " + PunishUI.cnf_abuse_cmds_length + " " + PunishUI.cnf_abuse_cmds_form + " Chat related..");
        }

        if (Objects.equals("tempmute", PunishUI.cnf_abuse_cmds_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempmute + " " + PunishUI.pn + " " + PunishUI.cnf_abuse_cmds_length + " " + PunishUI.cnf_abuse_cmds_form + " Chat related..");
        }

      }

      if (e.getSlot() == 11)
      {
        e.setCancelled(true);
        p.closeInventory();

        p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "a PvP related offence" + ChatColor.RED + ".");

        if (Objects.equals("perm", PunishUI.cnf_pvp_cmd))
        {
          p.chat("/" + PunishUI.cnf_ban + PunishUI.pn + " PvP Related.");
        }

        if (Objects.equals("kick", PunishUI.cnf_pvp_cmd))
        {
          p.chat("/" + PunishUI.cnf_kick + PunishUI.pn + " PvP Related.");
        }

        if (Objects.equals("mute", PunishUI.cnf_pvp_cmd))
        {
          p.chat("/" + PunishUI.cnf_mute + " " + PunishUI.pn + " PvP Related.");
        }

        if (Objects.equals("warn", PunishUI.cnf_pvp_cmd))
        {
          p.chat("/" + PunishUI.cnf_warn + " " + PunishUI.pn + " PvP Related.");
        }

        if (Objects.equals("tempban", PunishUI.cnf_pvp_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempban + " " + PunishUI.pn + " " + PunishUI.cnf_pvp_length + " " + PunishUI.cnf_pvp_form + " PvP Related.");
        }

        if (Objects.equals("tempmute", PunishUI.cnf_pvp_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempmute + " " + PunishUI.pn + " " + PunishUI.cnf_pvp_length + " " + PunishUI.cnf_pvp_form + " PvP Related.");
        }

      }

      if (e.getSlot() == 12)
      {
        e.setCancelled(true);
        p.closeInventory();

        p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "greifing" + ChatColor.RED + ".");

        if (Objects.equals("perm", PunishUI.cnf_greifing_cmd))
        {
          p.chat("/" + PunishUI.cnf_ban + PunishUI.pn + " Greifing.");
        }

        if (Objects.equals("kick", PunishUI.cnf_greifing_cmd))
        {
          p.chat("/" + PunishUI.cnf_kick + PunishUI.pn + " Greifing.");
        }

        if (Objects.equals("mute", PunishUI.cnf_greifing_cmd))
        {
          p.chat("/" + PunishUI.cnf_mute + " " + PunishUI.pn + " Greifing.");
        }

        if (Objects.equals("warn", PunishUI.cnf_greifing_cmd))
        {
          p.chat("/" + PunishUI.cnf_warn + " " + PunishUI.pn + " Greifing.");
        }

        if (Objects.equals("tempban", PunishUI.cnf_greifing_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempban + " " + PunishUI.pn + " " + PunishUI.cnf_greifing_length + " " + PunishUI.cnf_greifing_form + " Greifing.");
        }

        if (Objects.equals("tempmute", PunishUI.cnf_greifing_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempmute + " " + PunishUI.pn + " " + PunishUI.cnf_greifing_length + " " + PunishUI.cnf_greifing_form + " Greifing.");
        }

      }

      if (e.getSlot() == 13)
      {
        e.setCancelled(true);
        p.closeInventory();

        p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "interrupting a roleplay" + ChatColor.RED + ".");

        if (Objects.equals("perm", PunishUI.cnf_roleplay_cmd))
        {
          p.chat("/" + PunishUI.cnf_ban + PunishUI.pn + " Interrupting a Roleplay.");
        }

        if (Objects.equals("kick", PunishUI.cnf_roleplay_cmd))
        {
          p.chat("/" + PunishUI.cnf_kick + PunishUI.pn + " Interrupting a Roleplay.");
        }

        if (Objects.equals("mute", PunishUI.cnf_roleplay_cmd))
        {
          p.chat("/" + PunishUI.cnf_mute + " " + PunishUI.pn + " Interrupting a Roleplay.");
        }

        if (Objects.equals("warn", PunishUI.cnf_roleplay_cmd))
        {
          p.chat("/" + PunishUI.cnf_warn + " " + PunishUI.pn + " Interrupting a Roleplay.");
        }

        if (Objects.equals("tempban", PunishUI.cnf_roleplay_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempban + " " + PunishUI.pn + " " + PunishUI.cnf_roleplay_length + " " + PunishUI.cnf_roleplay_form + " Interrupting a Roleplay.");
        }

        if (Objects.equals("tempmute", PunishUI.cnf_roleplay_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempmute + " " + PunishUI.pn + " " + PunishUI.cnf_roleplay_length + " " + PunishUI.cnf_roleplay_form + " Interrupting a Roleplay.");
        }

      }

      if (e.getSlot() == 14)
      {
        e.setCancelled(true);
        p.closeInventory();

        p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "a chat related offence" + ChatColor.RED + ".");

        if (Objects.equals("perm", PunishUI.cnf_chat_cmd))
        {
          p.chat("/" + PunishUI.cnf_ban + PunishUI.pn + " Chat related..");
        }

        if (Objects.equals("kick", PunishUI.cnf_chat_cmd))
        {
          p.chat("/" + PunishUI.cnf_kick + PunishUI.pn + " Chat related..");
        }

        if (Objects.equals("mute", PunishUI.cnf_chat_cmd))
        {
          p.chat("/" + PunishUI.cnf_mute + " " + PunishUI.pn + " Chat related..");
        }

        if (Objects.equals("warn", PunishUI.cnf_chat_cmd))
        {
          p.chat("/" + PunishUI.cnf_warn + " " + PunishUI.pn + " Chat related..");
        }

        if (Objects.equals("tempban", PunishUI.cnf_chat_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempban + " " + PunishUI.pn + " " + PunishUI.cnf_chat_length + " " + PunishUI.cnf_chat_form + " Chat related..");
        }

        if (Objects.equals("tempmute", PunishUI.cnf_chat_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempmute + " " + PunishUI.pn + " " + PunishUI.cnf_chat_length + " " + PunishUI.cnf_chat_form + " Chat related..");
        }

      }

      if (e.getSlot() == 15)
      {
        e.setCancelled(true);
        p.closeInventory();

        p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "discrimination" + ChatColor.RED + ".");

        if (Objects.equals("perm", PunishUI.cnf_discrim_cmd))
        {
          p.chat("/" + PunishUI.cnf_ban + PunishUI.pn + " Discrimination.");
        }

        if (Objects.equals("kick", PunishUI.cnf_discrim_cmd))
        {
          p.chat("/" + PunishUI.cnf_kick + PunishUI.pn + " Discrimination.");
        }

        if (Objects.equals("mute", PunishUI.cnf_discrim_cmd))
        {
          p.chat("/" + PunishUI.cnf_mute + " " + PunishUI.pn + " Discrimination.");
        }

        if (Objects.equals("warn", PunishUI.cnf_discrim_cmd))
        {
          p.chat("/" + PunishUI.cnf_warn + " " + PunishUI.pn + " Discrimination.");
        }

        if (Objects.equals("tempban", PunishUI.cnf_discrim_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempban + " " + PunishUI.pn + " " + PunishUI.cnf_discrim_length + " " + PunishUI.cnf_discrim_form + " Discrimination.");
        }

        if (Objects.equals("tempmute", PunishUI.cnf_discrim_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempmute + " " + PunishUI.pn + " " + PunishUI.cnf_discrim_length + " " + PunishUI.cnf_discrim_form + " Discrimination.");
        }

      }

      if (e.getSlot() == 16)
      {
        e.setCancelled(true);
        p.closeInventory();

        p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "cheating" + ChatColor.RED + ".");

        if (Objects.equals("perm", PunishUI.cnf_cheating_cmd))
        {
          p.chat("/" + PunishUI.cnf_ban + PunishUI.pn + " Cheating.");
        }

        if (Objects.equals("kick", PunishUI.cnf_cheating_cmd))
        {
          p.chat("/" + PunishUI.cnf_kick + PunishUI.pn + " Cheating.");
        }

        if (Objects.equals("mute", PunishUI.cnf_cheating_cmd))
        {
          p.chat("/" + PunishUI.cnf_mute + " " + PunishUI.pn + " Cheating.");
        }

        if (Objects.equals("warn", PunishUI.cnf_cheating_cmd))
        {
          p.chat("/" + PunishUI.cnf_warn + " " + PunishUI.pn + " Cheating.");
        }

        if (Objects.equals("tempban", PunishUI.cnf_cheating_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempban + " " + PunishUI.pn + " " + PunishUI.cnf_cheating_length + " " + PunishUI.cnf_cheating_form + " Cheating.");
        }

        if (Objects.equals("tempmute", PunishUI.cnf_cheating_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempmute + " " + PunishUI.pn + " " + PunishUI.cnf_cheating_length + " " + PunishUI.cnf_cheating_form + " Cheating.");
        }

      }

      if (e.getSlot() == 17)
      {
        e.setCancelled(true);
        p.closeInventory();

        p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "scamming" + ChatColor.RED + ".");

        if (Objects.equals("perm", PunishUI.cnf_scamming_cmd))
        {
          p.chat("/" + PunishUI.cnf_ban + PunishUI.pn + " Scamming.");
        }

        if (Objects.equals("kick", PunishUI.cnf_scamming_cmd))
        {
          p.chat("/" + PunishUI.cnf_kick + PunishUI.pn + " Scamming.");
        }

        if (Objects.equals("mute", PunishUI.cnf_scamming_cmd))
        {
          p.chat("/" + PunishUI.cnf_mute + " " + PunishUI.pn + " Scamming.");
        }

        if (Objects.equals("warn", PunishUI.cnf_scamming_cmd))
        {
          p.chat("/" + PunishUI.cnf_warn + " " + PunishUI.pn + " Scamming.");
        }

        if (Objects.equals("tempban", PunishUI.cnf_scamming_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempban + " " + PunishUI.pn + " " + PunishUI.cnf_scamming_length + " " + PunishUI.cnf_scamming_form + " Scamming.");
        }

        if (Objects.equals("tempmute", PunishUI.cnf_scamming_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempmute + " " + PunishUI.pn + " " + PunishUI.cnf_scamming_length + " " + PunishUI.cnf_scamming_form + " Scamming.");
        }

      }

      if (e.getSlot() == 21)
      {
        e.setCancelled(true);
        p.closeInventory();

        p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "annoying staff" + ChatColor.RED + ".");

        if (Objects.equals("perm", PunishUI.cnf_annoying_cmd))
        {
          p.chat("/" + PunishUI.cnf_ban + PunishUI.pn + " Annoying Staff Members.");
        }

        if (Objects.equals("kick", PunishUI.cnf_annoying_cmd))
        {
          p.chat("/" + PunishUI.cnf_kick + PunishUI.pn + " Annoying Staff Members.");
        }

        if (Objects.equals("mute", PunishUI.cnf_annoying_cmd))
        {
          p.chat("/" + PunishUI.cnf_mute + " " + PunishUI.pn + " Annoying Staff Members.");
        }

        if (Objects.equals("warn", PunishUI.cnf_annoying_cmd))
        {
          p.chat("/" + PunishUI.cnf_warn + " " + PunishUI.pn + " Annoying Staff Members.");
        }

        if (Objects.equals("tempban", PunishUI.cnf_annoying_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempban + " " + PunishUI.pn + " " + PunishUI.cnf_annoying_length + " " + PunishUI.cnf_annoying_form + " Annoying Staff Members.");
        }

        if (Objects.equals("tempmute", PunishUI.cnf_annoying_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempmute + " " + PunishUI.pn + " " + PunishUI.cnf_annoying_length + " " + PunishUI.cnf_annoying_form + " Annoying Staff Members.");
        }

      }

      if (e.getSlot() == 22)
      {
        e.setCancelled(true);
        p.closeInventory();

        p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "disrespect" + ChatColor.RED + ".");

        if (Objects.equals("perm", PunishUI.cnf_disrespect_cmd))
        {
          p.chat("/" + PunishUI.cnf_ban + PunishUI.pn + " Being Disrespectful.");
        }

        if (Objects.equals("kick", PunishUI.cnf_disrespect_cmd))
        {
          p.chat("/" + PunishUI.cnf_kick + PunishUI.pn + " Being Disrespectful.");
        }

        if (Objects.equals("mute", PunishUI.cnf_disrespect_cmd))
        {
          p.chat("/" + PunishUI.cnf_mute + " " + PunishUI.pn + " Being Disrespectful.");
        }

        if (Objects.equals("warn", PunishUI.cnf_disrespect_cmd))
        {
          p.chat("/" + PunishUI.cnf_warn + " " + PunishUI.pn + " Being Disrespectful.");
        }

        if (Objects.equals("tempban", PunishUI.cnf_disrespect_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempban + " " + PunishUI.pn + " " + PunishUI.cnf_disrespect_length + " " + PunishUI.cnf_disrespect_form + " Being Disrespectful.");
        }

        if (Objects.equals("tempmute", PunishUI.cnf_disrespect_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempmute + " " + PunishUI.pn + " " + PunishUI.cnf_disrespect_length + " " + PunishUI.cnf_disrespect_form + " Being Disrespectful.");
        }

      }

      if (e.getSlot() == 23)
      {
        e.setCancelled(true);
        p.closeInventory();

        p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "being innapropriate" + ChatColor.RED + ".");

        if (Objects.equals("perm", PunishUI.cnf_innapropriate_cmd))
        {
          p.chat("/" + PunishUI.cnf_ban + PunishUI.pn + " Being Innapropriate.");
        }

        if (Objects.equals("kick", PunishUI.cnf_innapropriate_cmd))
        {
          p.chat("/" + PunishUI.cnf_kick + PunishUI.pn + " Being Innapropriate.");
        }

        if (Objects.equals("mute", PunishUI.cnf_innapropriate_cmd))
        {
          p.chat("/" + PunishUI.cnf_mute + " " + PunishUI.pn + " Being Innapropriate.");
        }

        if (Objects.equals("warn", PunishUI.cnf_innapropriate_cmd))
        {
          p.chat("/" + PunishUI.cnf_warn + " " + PunishUI.pn + " Being Innapropriate.");
        }

        if (Objects.equals("tempban", PunishUI.cnf_innapropriate_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempban + " " + PunishUI.pn + " " + PunishUI.cnf_innapropriate_length + " " + PunishUI.cnf_innapropriate_form + " Being Innapropriate.");
        }

        if (Objects.equals("tempmute", PunishUI.cnf_innapropriate_cmd))
        {
          p.chat("/" + PunishUI.cnf_tempmute + " " + PunishUI.pn + " " + PunishUI.cnf_innapropriate_length + " " + PunishUI.cnf_innapropriate_form + " Being Innapropriate.");
        }
      }
      
      if (e.getInventory().getTitle().equals(PunishUI.pui.getTitle()))
      {
        if (e.getSlot() == 4)
        {
          e.setCancelled(true);
          p.closeInventory();
        }

        if (e.getSlot() == 9)
        {
          e.setCancelled(true);
          p.closeInventory();

          p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Muting " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "swearing" + ChatColor.RED + ".");

          p.chat("/" + PunishUI.cnf_tempmute + PunishUI.pn + " " + p + " " + PunishUI.cnf_muteswearing_length + " " + PunishUI.cnf_muteswearing_form);

        }

        if (e.getSlot() == 10)
        {
          e.setCancelled(true);
          p.closeInventory();

          p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "bypassing the chat filters" + ChatColor.RED + ".");

          p.chat("/" + PunishUI.cnf_tempmute + PunishUI.pn + " " + p + " " + PunishUI.cnf_mutebypassing_length + " " + PunishUI.cnf_mutebypassing_form);

        }

        if (e.getSlot() == 11)
        {
          e.setCancelled(true);
          p.closeInventory();

          p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "threatening" + ChatColor.RED + ".");

          p.chat("/" + PunishUI.cnf_tempmute + PunishUI.pn + " " + p + " " + PunishUI.cnf_mutethreatening_length + " " + PunishUI.cnf_mutethreatening_form);

        }

        if (e.getSlot() == 12)
        {
          e.setCancelled(true);
          p.closeInventory();

          p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "being racist" + ChatColor.RED + ".");

          p.chat("/" + PunishUI.cnf_tempmute + PunishUI.pn + " " + p + " " + PunishUI.cnf_muteracism_length + " " + PunishUI.cnf_muteracism_form);
        }

        if (e.getSlot() == 13)
        {
          e.setCancelled(true);
          p.closeInventory();

          p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "being sexist" + ChatColor.RED + ".");

          p.chat("/" + PunishUI.cnf_tempmute + PunishUI.pn + " " + p + " " + PunishUI.cnf_mutesexism_length + " " + PunishUI.cnf_mutesexism_form);

        }

        if (e.getSlot() == 15)
        {
          e.setCancelled(true);
          p.closeInventory();

          p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "being innapropriate" + ChatColor.RED + ".");

          p.chat("/" + PunishUI.cnf_tempmute + PunishUI.pn + " " + p + " " + PunishUI.cnf_muteinnapropriate_length + " " + PunishUI.cnf_muteinnapropriate_form);

        }

        if (e.getSlot() == 16)
        {
          e.setCancelled(true);
          p.closeInventory();

          p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "discriminating" + ChatColor.RED + ".");

          p.chat("/" + PunishUI.cnf_tempmute + PunishUI.pn + " " + p + " " + PunishUI.cnf_mutediscrimination_length + " " + PunishUI.cnf_mutediscrimination_form);

        }

        if (e.getSlot() == 17)
        {
          e.setCancelled(true);
          p.closeInventory();

          p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "being unkind" + ChatColor.RED + ".");

          p.chat("/" + PunishUI.cnf_tempmute + PunishUI.pn + " " + p + " " + PunishUI.cnf_muteunkind_length + " " + PunishUI.cnf_muteunkind_form);

        }

        if (e.getSlot() == 21)
        {
          e.setCancelled(true);
          p.closeInventory();

          p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "scamming" + ChatColor.RED + ".");

          p.chat("/" + PunishUI.cnf_tempmute + PunishUI.pn + " " + p + " " + PunishUI.cnf_mutescam_length + " " + PunishUI.cnf_mutescam_form);

        }

        if (e.getSlot() == 22)
        {
          e.setCancelled(true);
          p.closeInventory();

          p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "causing offence" + ChatColor.RED + ".");

          p.chat("/" + PunishUI.cnf_tempmute + PunishUI.pn + " " + p + " " + PunishUI.cnf_muteoffence_length + " " + PunishUI.cnf_muteoffence_form);

        }

        if (e.getSlot() == 23)
        {
          e.setCancelled(true);
          p.closeInventory();

          p.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Punishing " + ChatColor.GOLD + PunishUI.pn + ChatColor.RED + " for " + ChatColor.GOLD + "another reason" + ChatColor.RED + ".");

          p.chat("/" + PunishUI.cnf_tempmute + PunishUI.pn + " " + p + " " + PunishUI.cnf_muteother_length + " " + PunishUI.cnf_muteother_form);
        }
      
    }
   }
  }
 }
}