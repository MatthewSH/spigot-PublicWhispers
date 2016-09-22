package com.matthewhatcher.publicwhispers;

import org.bukkit.plugin.java.JavaPlugin;

import com.matthewhatcher.publicwhispers.Listeners.WhisperListener;

public class PublicWhispers extends JavaPlugin
{
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new WhisperListener(), this);
		super.onEnable();
	}
}
