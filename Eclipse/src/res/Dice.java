package res;

public class Dice {
	private int qty;
	private int sides;
	
	public Dice(int quantity, int faces) { 
		qty = quantity;
		sides = faces;
	}
	
	public String getDie() { 
		return Integer.toString(qty) + "d" + Integer.toString(sides);
	}
}
