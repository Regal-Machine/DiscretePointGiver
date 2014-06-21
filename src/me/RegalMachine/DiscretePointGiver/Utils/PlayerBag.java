package me.RegalMachine.DiscretePointGiver.Utils;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;

public class PlayerBag {
	
	private static Map<Player, PointPlayer> players = new HashMap<Player, PointPlayer>();
	
	public static void addPlayer(Player p){
		players.put(p, new PointPlayer(p));
	}
	
	public static PointPlayer getPointPlayer(Player p){
		if(players.containsKey(p)){
			return players.get(p);
		}else{
			addPlayer(p);
			return players.get(p);
		}
	}
}
