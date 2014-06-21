package me.RegalMachine.DiscretePointGiver;

import me.RegalMachine.DiscretePointGiver.EventHandlers.Interacting;
import me.RegalMachine.DiscretePointGiver.EventHandlers.Joining;
import me.RegalMachine.DiscretePointGiver.EventHandlers.Moving;
import me.RegalMachine.DiscretePointGiver.EventHandlers.Sneaking;
import me.RegalMachine.DiscretePointGiver.Utils.ValueBag;
import me.RegalMachine.NeoPointsAPI.PointAPI;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class DiscretePointGiver extends JavaPlugin{
	
	public static PointAPI normalPoints;
	
	public static DiscretePointGiver instance;
	
	@Override
	public void onEnable() {
		
		instance = this;
		
		saveDefaultConfig();
		ValueBag.loadValues();
		
		
		normalPoints = new PointAPI("NormalPoints");
		
		Bukkit.getPluginManager().registerEvents(new Sneaking(), this);
		Bukkit.getPluginManager().registerEvents(new Moving(), this);
		Bukkit.getPluginManager().registerEvents(new Joining(), this);
		Bukkit.getPluginManager().registerEvents(new Interacting(), this);
	}

	
}
