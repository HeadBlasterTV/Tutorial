package me.headblastertv;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial extends JavaPlugin{

	@Override
	public void onEnable() {
		
		Bukkit.getConsoleSender().sendMessage("[" + this.getDescription().getName() + "] activated");
		
	}
	
}
