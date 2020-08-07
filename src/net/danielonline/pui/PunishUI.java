package net.danielonline.pui;

import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class PunishUI extends JavaPlugin
{
  public static String cnf_ban;
  public static String cnf_kick;
  public static String cnf_mute;
  public static String cnf_tempban;
  public static String cnf_tempmute;
  public static String cnf_warn;
  public static String cnf_dupeip;
  public static String cnf_uuid;
  public static String cnf_checkban;
  public static String cnf_hacking_length;
  public static String cnf_hacking_form;
  public static String cnf_hacking_cmd;
  public static String cnf_pvp_length;
  public static String cnf_pvp_form;
  public static String cnf_pvp_cmd;
  public static String cnf_abuse_cmds_length;
  public static String cnf_abuse_cmds_form;
  public static String cnf_abuse_cmds_cmd;
  public static String cnf_greifing_length;
  public static String cnf_greifing_form;
  public static String cnf_greifing_cmd;
  public static String cnf_roleplay_length;
  public static String cnf_roleplay_form;
  public static String cnf_roleplay_cmd;
  public static String cnf_chat_length;
  public static String cnf_chat_form;
  public static String cnf_chat_cmd;
  public static String cnf_discrim_length;
  public static String cnf_discrim_form;
  public static String cnf_discrim_cmd;
  public static String cnf_cheating_length;
  public static String cnf_cheating_form;
  public static String cnf_cheating_cmd;
  public static String cnf_scamming_length;
  public static String cnf_scamming_form;
  public static String cnf_scamming_cmd;
  public static String cnf_annoying_length;
  public static String cnf_annoying_form;
  public static String cnf_annoying_cmd;
  public static String cnf_disrespect_length;
  public static String cnf_disrespect_form;
  public static String cnf_disrespect_cmd;
  public static String cnf_innapropriate_length;
  public static String cnf_innapropriate_form;
  public static String cnf_innapropriate_cmd;
  public static String cnf_muteswearing_length;
  public static String cnf_muteswearing_form;
  public static String cnf_mutebypassing_length;
  public static String cnf_mutebypassing_form;
  public static String cnf_mutethreatening_length;
  public static String cnf_mutethreatening_form;
  public static String cnf_muteracism_length;
  public static String cnf_muteracism_form;
  public static String cnf_mutesexism_length;
  public static String cnf_mutesexism_form;
  public static String cnf_muteinnapropriate_length;
  public static String cnf_muteinnapropriate_form;
  public static String cnf_mutediscrimination_length;
  public static String cnf_mutediscrimination_form;
  public static String cnf_muteunkind_length;
  public static String cnf_muteunkind_form;
  public static String cnf_mutescam_length;
  public static String cnf_mutescam_form;
  public static String cnf_muteoffence_length;
  public static String cnf_muteoffence_form;
  public static String cnf_mutedisrespect_length;
  public static String cnf_mutedisrespect_form;
  public static String cnf_muteother_length;
  public static String cnf_muteother_form;
  
  FileConfiguration config = getConfig();

  public final PlayerListener playerListener = new PlayerListener();
  public static String pn;
  public static Inventory tui = Bukkit.createInventory(null, 9, ChatColor.GOLD + "Administration Interface!");
  public static Inventory pui = Bukkit.createInventory(null, 27, ChatColor.GOLD + "Moderator Interface!");
  public static Inventory sui = Bukkit.createInventory(null, 36, ChatColor.GOLD + "Task Selection Interface!");
  public static Inventory mui = Bukkit.createInventory(null, 27, ChatColor.GOLD + "Chat Moderator Interface!");
  public static Inventory msui = Bukkit.createInventory(null, 36, ChatColor.GOLD + "Task Selection Interface!");

  public void onConfigCheck()
  {
    getConfig();

    cnf_muteswearing_length = this.config.getString("cmds.lengths.MuteSwearing.length");
    cnf_muteswearing_form = this.config.getString("cmds.lengths.MuteSwearing.form");
    cnf_mutebypassing_length = this.config.getString("cmds.lengths.MuteBypassing.length");
    cnf_mutebypassing_form = this.config.getString("cmds.lengths.MuteBypassing.form");
    cnf_mutethreatening_length = this.config.getString("cmds.lengths.MuteThreatening.length");
    cnf_mutethreatening_form = this.config.getString("cmds.lengths.MuteThreatening.form");
    cnf_muteracism_length = this.config.getString("cmds.lengths.MuteRacism.length");
    cnf_muteracism_form = this.config.getString("cmds.lengths.MuteRacism.form");
    cnf_mutesexism_length = this.config.getString("cmds.lengths.MuteSexism.length");
    cnf_mutesexism_form = this.config.getString("cmds.lengths.MuteSexism.form");
    cnf_muteinnapropriate_length = this.config.getString("cmds.lengths.MuteInnapropriate.length");
    cnf_muteinnapropriate_form = this.config.getString("cmds.lengths.MuteInnapropriate.form");
    cnf_mutediscrimination_length = this.config.getString("cmds.lengths.MuteDiscrimination.length");
    cnf_mutediscrimination_form = this.config.getString("cmds.lengths.MuteDiscrimination.form");
    cnf_muteunkind_length = this.config.getString("cmds.lengths.MuteUnkind.length");
    cnf_muteunkind_form = this.config.getString("cmds.lengths.MuteUnkind.form");
    cnf_mutescam_length = this.config.getString("cmds.lengths.MuteScam.length");
    cnf_mutescam_form = this.config.getString("cmds.lengths.MuteScam.form");
    cnf_muteoffence_length = this.config.getString("cmds.lengths.MuteOffence.length");
    cnf_muteoffence_form = this.config.getString("cmds.lengths.MuteOffence.form");
    cnf_mutedisrespect_length = this.config.getString("cmds.lengths.MuteDisrespect.length");
    cnf_mutedisrespect_form = this.config.getString("cmds.lengths.MuteDisrespect.form");
    cnf_muteother_length = this.config.getString("cmds.lengths.MuteOther.length");
    cnf_muteother_form = this.config.getString("cmds.lengths.MuteOther.form");
    
    cnf_ban = this.config.getString("cmds.punish.ban_command");
    cnf_kick = this.config.getString("cmds.punish.kick_command");
    cnf_mute = this.config.getString("cmds.punish.mute_command");
    cnf_tempban = this.config.getString("cmds.punish.tempban_command");
    cnf_tempmute = this.config.getString("cmds.punish.tempmute_command");
    cnf_warn = this.config.getString("cmds.punish.warn_command");
    cnf_dupeip = this.config.getString("cmds.tools.altfinder_command");
    cnf_uuid = this.config.getString("cmds.tools.uuidfinder_command");
    cnf_checkban = this.config.getString("cmds.tools.statuscheck_command");

    cnf_hacking_length = getConfig().getString("lengths.Hacking.length");
    cnf_hacking_form = getConfig().getString("lengths.Hacking.form");
    cnf_hacking_cmd = this.config.getString("lengths.Hacking.cmd");

    cnf_abuse_cmds_length = getConfig().getString("lengths.Cmd_Abuse.length");
    cnf_abuse_cmds_form = getConfig().getString("lengths.Cmd_Abuse.form");
    cnf_abuse_cmds_cmd = this.config.getString("lengths.Cmd_Abuse.cmd");

    cnf_pvp_length = getConfig().getString("lengths.Pvp_Rel.length");
    cnf_pvp_form = getConfig().getString("lengths.Pvp_Rel.form");
    cnf_pvp_cmd = this.config.getString("lengths.Pvp_Rel.cmd");

    cnf_greifing_length = getConfig().getString("lengths.Greifing.length");
    cnf_greifing_form = getConfig().getString("lengths.Greifing.form");
    cnf_greifing_cmd = this.config.getString("lengths.Greifing.cmd");

    cnf_roleplay_length = getConfig().getString("lengths.Roleplay.length");
    cnf_roleplay_form = getConfig().getString("lengths.Roleplay.form");
    cnf_roleplay_cmd = this.config.getString("lengths.Roleplay.cmd");

    cnf_chat_length = getConfig().getString("lengths.Chat.length");
    cnf_chat_form = getConfig().getString("lengths.Chat.form");
    cnf_chat_cmd = this.config.getString("lengths.Chat.cmd");

    cnf_discrim_length = getConfig().getString("lengths.Discrimination.length");
    cnf_discrim_form = getConfig().getString("lengths.Discrimination..form");
    cnf_discrim_cmd = this.config.getString("lengths.Discrimination..cmd");

    cnf_cheating_length = getConfig().getString("lengths.Cheating.length");
    cnf_cheating_form = getConfig().getString("lengths.Cheating.form");
    cnf_cheating_cmd = this.config.getString("lengths.Cheating.cmd");

    cnf_scamming_length = getConfig().getString("lengths.Scamming.length");
    cnf_scamming_form = getConfig().getString("lengths.Scamming.form");
    cnf_scamming_cmd = this.config.getString("lengths.Scamming.cmd");

    cnf_annoying_length = getConfig().getString("lengths.Annoying.length");
    cnf_annoying_form = getConfig().getString("lengths.Annoying.form");
    cnf_annoying_cmd = this.config.getString("lengths.Annoying.cmd");

    cnf_disrespect_length = getConfig().getString("lengths.Disrespect.length");
    cnf_disrespect_form = getConfig().getString("lengths.Disrespect.form");
    cnf_disrespect_cmd = this.config.getString("lengths.Disrespect.cmd");

    cnf_innapropriate_length = getConfig().getString("lengths.Innapropriate.length");
    cnf_innapropriate_form = getConfig().getString("lengths.Innapropriate.form");
    cnf_innapropriate_cmd = this.config.getString("lengths.Innapropriate.cmd");

    this.config.options().copyDefaults(true);
    saveConfig();
  }

  public void onDisable()
  {
    getLogger().info("Plugin has been disabled :(");
    getLogger().info("Bye!");
  }

  public void onEnable() {
    onConfigCheck();

    getLogger().info("I'm tired!");
    getServer().getPluginManager().registerEvents(this.playerListener, this);
    getLogger().info("I've just woken up :) Plugin enabled!");
  }

  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player player = (Player)sender;

    if (cmd.getName().equalsIgnoreCase("punishui"))
    {
      InfoCommand.pluginInfo(args, player);
    }

    if (cmd.getName().equalsIgnoreCase("punishinterface"))
    {
      InfoCommand.pluginInfo(args, player);
    }

    if (cmd.getName().equalsIgnoreCase("pui"))
    {
      InfoCommand.pluginInfo(args, player);
    }

    if (cmd.getName().equalsIgnoreCase("credits"))
    {
      CreditCommand.showCredit(player);
    }

    if (cmd.getName().equalsIgnoreCase("puicredits"))
    {
      CreditCommand.showCredit(player);
    }
    
    if (cmd.getName().equalsIgnoreCase("mute"))
    {
    	
    	if ((args.length >1) || (args.length < 1))
    	{
    		player.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Please enter only one argument - this should be the player's username!");
    	}
    	else
    	{
    		
            pn = args[0];
            player.sendMessage(ChatColor.RED + "Showing chat moderator selection menu for " + ChatColor.GOLD + args[0] + ChatColor.RED + ".");

            ItemStack mute = new ItemStack(Material.WOOL);
            ItemStack tools = new ItemStack(Material.COMMAND);

            ItemStack findalts = new ItemStack(Material.PAPER);
            ItemStack banstats = new ItemStack(Material.WRITTEN_BOOK);
            ItemStack finduuid = new ItemStack(Material.NAME_TAG);

            ItemStack info = new ItemStack(Material.SIGN);
            ItemStack swearing = new ItemStack(Material.WOOL);
            ItemStack bypassing = new ItemStack(Material.COMMAND);
            ItemStack threatening = new ItemStack(Material.IRON_SWORD);
            ItemStack racism = new ItemStack(Material.BAKED_POTATO);
            ItemStack sexism = new ItemStack(Material.BED);
            ItemStack innapropriate = new ItemStack(Material.PAPER);
            ItemStack discrimination = new ItemStack(Material.TOTEM);
            ItemStack unkind = new ItemStack(Material.MINECART);
            ItemStack scam = new ItemStack(Material.DIRT);
            ItemStack offence = new ItemStack(Material.WEB);
            ItemStack disrespect = new ItemStack(Material.LAVA_BUCKET);
            ItemStack other = new ItemStack(Material.COBBLESTONE);

            ItemMeta findaltsm = findalts.getItemMeta();
            findaltsm.setDisplayName(ChatColor.GOLD + "Find Known Alts");
            findalts.setItemMeta(findaltsm);

            ItemMeta banstatsm = banstats.getItemMeta();
            banstatsm.setDisplayName(ChatColor.GOLD + "Check Ban Statistics");
            banstats.setItemMeta(banstatsm);

            ItemMeta finduuidm = finduuid.getItemMeta();
            finduuidm.setDisplayName(ChatColor.GOLD + "Get UUID");
            finduuid.setItemMeta(finduuidm);

            ItemMeta mutem = swearing.getItemMeta();
            mutem.setDisplayName(ChatColor.GOLD + "Mute " + args[0]);
            mute.setItemMeta(mutem);

            ItemMeta toolsm = tools.getItemMeta();
            toolsm.setDisplayName(ChatColor.GOLD + "Administrate " + args[0]);
            tools.setItemMeta(toolsm);

            ItemMeta infom = info.getItemMeta();
            infom.setDisplayName(ChatColor.GOLD + "Punish Interface for " + args[0]);
            info.setItemMeta(infom);

            ItemMeta swearingm = swearing.getItemMeta();
            swearingm.setDisplayName(ChatColor.RED + "Swearing");
            swearing.setItemMeta(swearingm);

            ItemMeta bypassingm = bypassing.getItemMeta();
            bypassingm.setDisplayName(ChatColor.RED + "Bypassing Filters");
            bypassing.setItemMeta(bypassingm);

            ItemMeta threateningm = threatening.getItemMeta();
            threateningm.setDisplayName(ChatColor.RED + "Threatening");
            threatening.setItemMeta(threateningm);

            ItemMeta racismm = racism.getItemMeta();
            racismm.setDisplayName(ChatColor.RED + "Racism");
            racism.setItemMeta(racismm);

            ItemMeta sexismm = sexism.getItemMeta();
            sexismm.setDisplayName(ChatColor.RED + "Sexism");
            sexism.setItemMeta(sexismm);

            ItemMeta innapropriatem = innapropriate.getItemMeta();
            innapropriatem.setDisplayName(ChatColor.RED + "Being Innapropriate");
            innapropriate.setItemMeta(innapropriatem);

            ItemMeta discriminationm = discrimination.getItemMeta();
            discriminationm.setDisplayName(ChatColor.GOLD + "Discrimination");
            discrimination.setItemMeta(discriminationm);

            ItemMeta unkindm = unkind.getItemMeta();
            unkindm.setDisplayName(ChatColor.GOLD + "Being Unkind");
            unkind.setItemMeta(unkindm);

            ItemMeta scamm = scam.getItemMeta();
            scamm.setDisplayName(ChatColor.GOLD + "Scamming");
            scam.setItemMeta(scamm);

            ItemMeta offencem = offence.getItemMeta();
            offencem.setDisplayName(ChatColor.GOLD + "Causing Offence");
            offence.setItemMeta(offencem);

            ItemMeta disrespectm = disrespect.getItemMeta();
            disrespectm.setDisplayName(ChatColor.GOLD + "Disrespect");
            disrespect.setItemMeta(disrespectm);

            ItemMeta otherm = other.getItemMeta();
            otherm.setDisplayName(ChatColor.GOLD + "Other");
            other.setItemMeta(otherm);

            tui.setItem(4, findalts);
            tui.setItem(2, banstats);
            tui.setItem(6, finduuid);

            msui.setItem(13, mute);
            msui.setItem(22, tools);

            mui.setItem(4, info);
            mui.setItem(9, swearing);
            mui.setItem(10, bypassing);
            mui.setItem(11, threatening);
            mui.setItem(12, racism);
            mui.setItem(13, sexism);
            mui.setItem(14, innapropriate);
            mui.setItem(15, discrimination);
            mui.setItem(16, unkind);
            mui.setItem(17, scam);
            mui.setItem(21, offence);
            mui.setItem(22, disrespect);
            mui.setItem(23, other);

            player.openInventory(mui);
    		
    	}
    	
    }
    

    if (cmd.getName().equalsIgnoreCase("ban"))
    {
      if ((args.length > 1) || (args.length < 1))
      {
        player.sendMessage(ChatColor.RED + "PunishUI" + ChatColor.GOLD + " >>> " + ChatColor.RED + "Please enter only one argument - this should be the player's username!");
      }
      else
      {
        pn = args[0];
        player.sendMessage(ChatColor.RED + "Showing moderator selection menu for " + ChatColor.GOLD + args[0] + ChatColor.RED + ".");

        ItemStack punish = new ItemStack(Material.DIAMOND_SWORD);
        ItemStack tools = new ItemStack(Material.COMMAND);

        ItemStack findalts = new ItemStack(Material.PAPER);
        ItemStack banstats = new ItemStack(Material.WRITTEN_BOOK);
        ItemStack finduuid = new ItemStack(Material.NAME_TAG);

        ItemStack info = new ItemStack(Material.SIGN);
        ItemStack hacking = new ItemStack(Material.REDSTONE_BLOCK);
        ItemStack powers = new ItemStack(Material.COMMAND);
        ItemStack pvp = new ItemStack(Material.IRON_SWORD);
        ItemStack greifing = new ItemStack(Material.LAVA_BUCKET);
        ItemStack roleplay = new ItemStack(Material.BED);
        ItemStack chat = new ItemStack(Material.PAPER);
        ItemStack discrimination = new ItemStack(Material.BOOK);
        ItemStack cheating = new ItemStack(Material.MINECART);
        ItemStack scam = new ItemStack(Material.DIRT);
        ItemStack staff = new ItemStack(Material.WEB);
        ItemStack disrespect = new ItemStack(Material.WATER_BUCKET);
        ItemStack innapropriate = new ItemStack(Material.COBBLESTONE);

        ItemMeta findaltsm = findalts.getItemMeta();
        findaltsm.setDisplayName(ChatColor.GOLD + "Find Known Alts");
        findalts.setItemMeta(findaltsm);

        ItemMeta banstatsm = banstats.getItemMeta();
        banstatsm.setDisplayName(ChatColor.GOLD + "Check Ban Statistics");
        banstats.setItemMeta(banstatsm);

        ItemMeta finduuidm = finduuid.getItemMeta();
        finduuidm.setDisplayName(ChatColor.GOLD + "Get UUID");
        finduuid.setItemMeta(finduuidm);

        ItemMeta punishm = punish.getItemMeta();
        punishm.setDisplayName(ChatColor.GOLD + "Punish " + args[0]);
        punish.setItemMeta(punishm);

        ItemMeta toolsm = tools.getItemMeta();
        toolsm.setDisplayName(ChatColor.GOLD + "Administrate " + args[0]);
        tools.setItemMeta(toolsm);

        ItemMeta infom = info.getItemMeta();
        infom.setDisplayName(ChatColor.GOLD + "Punish Interface for " + args[0]);
        info.setItemMeta(infom);

        ItemMeta hackingm = hacking.getItemMeta();
        hackingm.setDisplayName(ChatColor.RED + "Hacking");
        hacking.setItemMeta(hackingm);

        ItemMeta powersm = powers.getItemMeta();
        powersm.setDisplayName(ChatColor.RED + "Abusing Powers");
        powers.setItemMeta(powersm);

        ItemMeta pvpm = pvp.getItemMeta();
        pvpm.setDisplayName(ChatColor.RED + "PvP Related");
        pvp.setItemMeta(pvpm);

        ItemMeta greifingm = greifing.getItemMeta();
        greifingm.setDisplayName(ChatColor.RED + "Greifing");
        greifing.setItemMeta(greifingm);

        ItemMeta roleplaym = roleplay.getItemMeta();
        roleplaym.setDisplayName(ChatColor.RED + "Interrupting Roleplay");
        roleplay.setItemMeta(roleplaym);

        ItemMeta chatm = chat.getItemMeta();
        chatm.setDisplayName(ChatColor.RED + "Chat Related");
        chat.setItemMeta(chatm);

        ItemMeta discriminationm = discrimination.getItemMeta();
        discriminationm.setDisplayName(ChatColor.GOLD + "Discrimination");
        discrimination.setItemMeta(discriminationm);

        ItemMeta cheatingm = cheating.getItemMeta();
        cheatingm.setDisplayName(ChatColor.GOLD + "Cheating");
        cheating.setItemMeta(cheatingm);

        ItemMeta scamm = scam.getItemMeta();
        scamm.setDisplayName(ChatColor.GOLD + "Scamming");
        scam.setItemMeta(scamm);

        ItemMeta staffm = staff.getItemMeta();
        staffm.setDisplayName(ChatColor.GOLD + "Annoying Staff");
        staff.setItemMeta(staffm);

        ItemMeta disrespectm = disrespect.getItemMeta();
        disrespectm.setDisplayName(ChatColor.GOLD + "Disrespect");
        disrespect.setItemMeta(disrespectm);

        ItemMeta innapropriatem = innapropriate.getItemMeta();
        innapropriatem.setDisplayName(ChatColor.GOLD + "Innapropriate");
        innapropriate.setItemMeta(innapropriatem);

        tui.setItem(4, findalts);
        tui.setItem(2, banstats);
        tui.setItem(6, finduuid);

        sui.setItem(13, punish);
        sui.setItem(22, tools);

        pui.setItem(4, info);
        pui.setItem(9, hacking);
        pui.setItem(10, powers);
        pui.setItem(11, pvp);
        pui.setItem(12, greifing);
        pui.setItem(13, roleplay);
        pui.setItem(14, chat);
        pui.setItem(15, discrimination);
        pui.setItem(16, cheating);
        pui.setItem(17, scam);
        pui.setItem(21, staff);
        pui.setItem(22, disrespect);
        pui.setItem(23, innapropriate);

        player.openInventory(pui);
      }

    }

    return false;
  }

  public static void openPunish(Player player)
  {
    player.sendMessage(ChatColor.RED + "Opening moderator menu for " + ChatColor.GOLD + pn + ChatColor.RED + ".");
    player.openInventory(pui);
  }

  public static void openTools(Player player)
  {
    player.sendMessage(ChatColor.RED + "Opening administration menu for " + ChatColor.GOLD + pn + ChatColor.RED + ".");
    player.openInventory(tui);
  }
  
  public static void openMute(Player player)
  {
    player.sendMessage(ChatColor.RED + "Opening chat moderator menu for " + ChatColor.GOLD + pn + ChatColor.RED + ".");
    player.openInventory(mui);
  }
}