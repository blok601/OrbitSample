package me.blok.orbit.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FireCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Only players can do this command!");
            return false;
        }

        Player player = (Player) sender;
        if (args.length != 1) {
            player.sendMessage(ChatColor.RED + "Usage: /fire <player>");
            return false;
        }

        Player target = Bukkit.getPlayer(args[0]);
        if (target == null) {
            player.sendMessage(ChatColor.RED + args[0] + " couldn't be found!");
            return false;
        }

        target.setFireTicks(60);
        player.sendMessage(ChatColor.GREEN + "Successfully set " + target.getName() + " on fire for 3 seconds!");
        return true;

    }
}
