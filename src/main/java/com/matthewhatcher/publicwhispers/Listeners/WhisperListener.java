package com.matthewhatcher.publicwhispers.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class WhisperListener implements Listener 
{
	@EventHandler
	public void onPlayerChat (AsyncPlayerChatEvent event) {
		Bukkit.getLogger().info(event.getRecipients().toString());
	}
}
