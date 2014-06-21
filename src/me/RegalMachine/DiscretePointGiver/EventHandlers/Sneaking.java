package me.RegalMachine.DiscretePointGiver.EventHandlers;

import me.RegalMachine.DiscretePointGiver.Utils.PlayerBag;
import me.RegalMachine.DiscretePointGiver.Utils.PointPlayer;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class Sneaking implements Listener{
	
	@EventHandler
	public void onSneak(PlayerToggleSneakEvent e){
		PointPlayer player = PlayerBag.getPointPlayer(e.getPlayer());
		if(player.getPlayer().isSneaking()){
			player.setSneaks(player.getSneaks() + 1);
		}else{
			player.snuck();
		}
	}

}
