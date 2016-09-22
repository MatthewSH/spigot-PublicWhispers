package com.matthewhatcher.publicwhispers.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.matthewhatcher.publicwhispers.PublicWhispers;

public class WhisperCommands implements CommandExecutor
{
	private PublicWhispers plugin;
	
	public WhisperCommands(PublicWhispers plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		return false;
	}

}
