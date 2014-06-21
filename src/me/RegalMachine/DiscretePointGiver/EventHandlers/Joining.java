package me.RegalMachine.DiscretePointGiver.EventHandlers;

import me.RegalMachine.DiscretePointGiver.Utils.PlayerBag;
import me.RegalMachine.DiscretePointGiver.Utils.ValueBag;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Joining implements Listener{
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		PlayerBag.getPointPlayer(e.getPlayer()).givePoints(ValueBag.joinPoints);
	}
	
}
