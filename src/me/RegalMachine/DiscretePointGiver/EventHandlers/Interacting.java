package me.RegalMachine.DiscretePointGiver.EventHandlers;

import me.RegalMachine.DiscretePointGiver.Utils.PlayerBag;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class Interacting implements Listener{
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e){
		PlayerBag.getPointPlayer(e.getPlayer()).interacted();
	}

}
