package me.RegalMachine.DiscretePointGiver.Utils;

import me.RegalMachine.DiscretePointGiver.DiscretePointGiver;

import org.bukkit.entity.Player;

public class PointPlayer {
	
	Player player;
	
	private int xWas;
	private int yWas;
	private int zWas;
	
	private int sneaks;
	private int moves;
	private int interacts;
	
	public PointPlayer(Player p){
		player = p;
		xWas = p.getLocation().getBlockX();
		yWas = p.getLocation().getBlockY();
		zWas = p.getLocation().getBlockZ();
		
		sneaks = 0;
		moves = 0;
		interacts = 0;
		
	}
	public Player getPlayer(){
		return player;
	}
	
	public void setXwas(int x){
		xWas = x;
	}
	
	public void setYWas(int y){
		yWas = y;
	}
	
	public void setZWas(int z){
		zWas = z;
	}
	
	public int getXWas(){
		return xWas;
	}
	
	public int getYWas(){
		return yWas;
	}
	
	public int getZWas(){
		return zWas;
	}
	
	public void snuck(){
		if(sneaks <0){
			sneaks = 0;
		}if(sneaks >= ValueBag.maxSneaks){
			givePoints(ValueBag.sneakPoints);
			sneaks = 0;
		}
	}
	
	public int getSneaks(){
		return sneaks;
	}
	
	public void setSneaks(int s){
		sneaks = s;
	}
	
	public void moving(){
		moves++;
	}
	
	public void moved(){
		if(moves >= ValueBag.maxMoves){
			givePoints(ValueBag.movePoints);
			moves = 0;
		}
	}
	
	public void interacted() {
		interacts ++;
		if(interacts >= ValueBag.maxInter){
			givePoints(ValueBag.interPoints);
			interacts = 0;
		}
	}
	
	public void givePoints(int x){
		DiscretePointGiver.normalPoints.setPoints(getPlayer().getUniqueId().toString(), DiscretePointGiver.normalPoints.getPoints(getPlayer().getUniqueId().toString()) + x);
		sneaks = 0;
	}
	
}
