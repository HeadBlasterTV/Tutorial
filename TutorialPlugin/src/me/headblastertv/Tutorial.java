package me.headblastertv;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Tutorial extends JavaPlugin{

	@Override
	public void onEnable() {
		
		Bukkit.getConsoleSender().sendMessage("[" + this.getDescription().getName() + "] activated");

		this.getCommand("tutorial").setExecutor(new TutorialCommand());
		
		
	}
	
	/**public void disableAI(Entity entity) {
	    net.minecraft.server.v1_8_R3.Entity nmsEnt = ((CraftEntity) entity).getHandle();
	    NBTTagCompound tag = nmsEnt.getNBTTag();
	     
	    if(tag == null) {
	        tag = new NBTTagCompound();
	    }
	     
	    nmsEnt.c(tag);
	    tag.setInt("NoAI", 1);
	    nmsEnt.f(tag);
	    
	}*/
	
}
 