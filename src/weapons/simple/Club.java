package weapons.simple;

import res.Dice;
import weapons.Weapon;

public class Club extends Weapon {

	public Club() {
		super("Club");
		super.setDamage(new Dice(1, 6));
		super.setCritical(20);
		super.setType("Bludgeoning");
		super.setRangeIncrement(10);
		super.setSize("Medium");
		super.setWeight(3);
		// TODO Auto-generated constructor stub
	}

}
