package me.headblastertv;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TutorialCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) { //Wenn der CommandSender ein Spieler ist, es kann nämlich auch ein CommandBlock oder die Console sein!
			
			Player p = (Player) sender; //Die Player Variable
			
			if(command.getName().equalsIgnoreCase("tutorial")) { //Wenn der Command(ohne Groß- und Kleinschreibung) tutorial ist
				
				if(p.hasPermission("tutorial.command")) { //Wenn der Spieler die Permission tutorial.command hat
					
					p.sendMessage("§4[§cTutorial§4]§cDer Command funktioniert!"); //Sendet dem Spieler die Message: §4[§cTutorial§4]§cDer Command funktioniert! Die § Zeichen stehen für &
					p.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 1, 1);   //Spielt den Sound BLOCK_NOTE_PLING beim Spieler ab
				}
				
			}
			
		}
		
		return true;
		
	}
	
	

}
