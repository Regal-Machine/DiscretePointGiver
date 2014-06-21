package me.RegalMachine.DiscretePointGiver.EventHandlers;


import me.RegalMachine.DiscretePointGiver.Utils.PlayerBag;
import me.RegalMachine.DiscretePointGiver.Utils.PointPlayer;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Moving implements Listener{
	
	@EventHandler
	public void onMovement(PlayerMoveEvent e){
		PointPlayer player = PlayerBag.getPointPlayer(e.getPlayer());
		
		Location loc = player.getPlayer().getLocation();
		
		int x = player.getXWas();
		int y = player.getYWas();
		int z = player.getZWas();
		
		if(x != loc.getBlockX()){
			player.moving();
			player.setXwas(loc.getBlockX());
		}
		if(y != loc.getBlockY()){
			player.moving();
			player.setYWas(loc.getBlockY());
		}
		if(z != loc.getBlockZ()){
			player.moving();
			player.setZWas(loc.getBlockZ());
		}
		
		player.moved();
		
	}
}
