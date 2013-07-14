package weapons;
import main.Main;
import res.Dice;
import res.Money.Gold;

public class Handaxe extends Weapon {

	public Handaxe(String name0) {
		super(name0);
		super.setCritical(3);
		super.setRangeIncrement(0);
		super.setType("Slashing");
		super.setHardness(5);
		getPlayerStats();
		
		/*
		 * add calc to account for player size
		 * and figure out cost, damage, weight, hp, and size accordingly
		 */
		
		// TODO Auto-generated constructor stub
	}
	
	private void getPlayerStats() { 
		String playerSize = Main.players.get(0).getSize();
		if(playerSize.equals("small")) { 
			super.setCost(new Gold(6));
			super.setDamage(new Dice(1, 4));
			super.setWeight(1);
			super.setHP(1);
		} else if (playerSize.equals("medium")) { 
			super.setCost(new Gold(6));
			super.setDamage(new Dice(1, 6));
			super.setWeight(3);
			super.setHP(2);
		} else if (playerSize.equals("large")) { 
			super.setCost(new Gold(12));
			super.setDamage(new Dice(1, 8));
			super.setWeight(6);
			super.setHP(4);
		} else { 
			System.out.println("err");
			super.setCost(new Gold(1));
			super.setDamage(new Dice(1, 1));
			super.setWeight(1);
			super.setHP(1);
		}
	}

}
