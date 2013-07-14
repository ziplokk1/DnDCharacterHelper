package weapons.simple;

import res.Dice;
import weapons.Weapon;

public class PunchingDagger extends Weapon {

	public PunchingDagger() {
		super("Dagger, Punching");
		super.setDamage(new Dice(1, 4));
		super.setCritical(20);
		super.setCriticalMultiplier(3);
		super.setType("Piercing");
		super.setRangeIncrement(0);
		super.setSize("Tiny");
		super.setWeight(2);
		// TODO Auto-generated constructor stub
	}

}
