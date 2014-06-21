package me.RegalMachine.DiscretePointGiver.Utils;

import me.RegalMachine.DiscretePointGiver.DiscretePointGiver;

public class ValueBag {
	
	public static int maxSneaks;
	public static int maxMoves;
	public static int maxInter;
	
	public static int joinPoints;
	public static int interPoints;
	public static int movePoints;
	public static int sneakPoints;
	
	public static void loadValues(){
		
		maxSneaks = DiscretePointGiver.instance.getConfig().getInt("numbers.sneaking");
		maxMoves = DiscretePointGiver.instance.getConfig().getInt("numbers.moving");
		maxInter = DiscretePointGiver.instance.getConfig().getInt("numbers.interacting");
		
		joinPoints = DiscretePointGiver.instance.getConfig().getInt("points.joining");
		interPoints = DiscretePointGiver.instance.getConfig().getInt("points.interacting");
		movePoints = DiscretePointGiver.instance.getConfig().getInt("points.moving");
		sneakPoints = DiscretePointGiver.instance.getConfig().getInt("points.sneaking");
	}
}
