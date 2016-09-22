package com.matthewhatcher.publicwhispers.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.matthewhatcher.publicwhispers.PublicWhispers;

public class WhisperCommands implements CommandExecutor
{
	private PublicWhispers plugin;
	
	public WhisperCommands(PublicWhispers plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			if(label.equalsIgnoreCase("tell") || label.equalsIgnoreCase("whisper") || label.equalsIgnoreCase("message") || label.equalsIgnoreCase("pm") || label.equalsIgnoreCase("w") || label.equalsIgnoreCase("msg")) {
				if(args.length < 2) {
					sender.sendMessage("§cUsage: /tell <player> <private message...>");
					return true;
				}
				
				Player target = plugin.getServer().getPlayer(args[0]);
				
				if(target == null) {
					sender.sendMessage("The target player is not online.");
					return true;
				}
				
				if(target.getName() == sender.getName()) {
					sender.sendMessage("You can not send a message to yourself.");
					return true;
				}
				
				String message = "§7" + ((Player) sender).getDisplayName() + " -> " + target.getDisplayName() + "§f: ";
				
				for(int i = 1; i < args.length; i++) {
					message += args[i];
				}
				
				if(!sender.hasPermission("publicwhispers.publicize")) {
					target.sendMessage(message);
				}
				
				plugin.getServer().broadcastMessage(message);
			}
		}
		
		return false;
	}

}
