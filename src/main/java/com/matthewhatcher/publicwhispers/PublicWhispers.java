package com.matthewhatcher.publicwhispers;

import org.bukkit.plugin.java.JavaPlugin;

import com.matthewhatcher.publicwhispers.Commands.WhisperCommands;

public class PublicWhispers extends JavaPlugin
{
	String[] commands = {
		"tell", "whisper", "message",
		"pm", "w", "msg"
	};
	
	@Override
	public void onEnable() {
		for(String command : commands) {
			this.getCommand(command).setExecutor(new WhisperCommands(this));
		}
		
		super.onEnable();
	}
	
	
}
