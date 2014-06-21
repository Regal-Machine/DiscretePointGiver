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
		writeConfig();
		ValueBag.loadValues();
		
		
		normalPoints = new PointAPI("NormalPoints");
		
		Bukkit.getPluginManager().registerEvents(new Sneaking(), this);
		Bukkit.getPluginManager().registerEvents(new Moving(), this);
		Bukkit.getPluginManager().registerEvents(new Joining(), this);
		Bukkit.getPluginManager().registerEvents(new Interacting(), this);
	}

	private void writeConfig() {
		
		if(!getConfig().contains("numbers"))
			getConfig().createSection("numbers");
		
		if(!getConfig().isInt("numbers.sneaking"))
			getConfig().addDefault("numbers.sneaking", 5);
		if(!getConfig().isInt("numbers.moving"))
			getConfig().addDefault("numbers.moving", 200);
		if(!getConfig().isInt("numbers.interact"))
			getConfig().addDefault("numbers.interacting", 500);
		
		
		if(!getConfig().contains("points"))
			getConfig().createSection("points");
		if(!getConfig().isInt("points.sneaking"))
			getConfig().addDefault("points.sneaking", 1);
		if(!getConfig().isInt("points.moving"))
			getConfig().addDefault("points.moving", 1);
		if(!getConfig().isInt("points.interacting"))
			getConfig().addDefault("points.interacting", 1);
		if(!getConfig().isInt("points.joining"))
			getConfig().addDefault("points.joining", 1);
		
		getConfig().options().copyDefaults(true);
		saveConfig();
		
	}
	
}
