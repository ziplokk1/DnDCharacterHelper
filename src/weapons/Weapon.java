package weapons;

import res.Dice;
import res.Money.Currency;

public class Weapon {
	private String name;
	private int CRITICAL;
	private int CRITICAL_MULTIPLIER;
	private int RANGE_INCREMENT;
	private String type;
	private int HARDNESS;
	private Currency cost;
	private Dice DAMAGE;
	private int WEIGHT;
	private int HP;
	private String size;
	
	public Weapon(String name0) { 
		this.name = name0;
	}
	
	public String getSize() { 
		return size;
	}
	
	public void setSize(String size0) { 
		size = size0;
	}
	
	public void setCriticalMultiplier(int crit) { 
		CRITICAL_MULTIPLIER = crit;
	}
	
	public int getCriticalMultiplier() { 
		return CRITICAL_MULTIPLIER;
	}
	
	public String getDamageVersus(String size) { 
		return "blank";
	}
	
	public void setHP(int hp) { 
		HP = hp;
	}
	
	public void setWeight(int weight) { 
		WEIGHT = weight;
	}
	
	public void setDamage(Dice die) { 
		DAMAGE = die;
	}
	
	public void setCost(Currency currency) { 
		cost = currency;
	}
	
	public void setHardness(int hardness) { 
		HARDNESS = hardness;
	}
	
	public void setType(String type0) { 
		type = type0;
	}
	
	public void setRangeIncrement(int range) { 
		RANGE_INCREMENT = range;
	}
	
	public void setCritical(int crit) { 
		CRITICAL = crit;
	}
	
	public String getName() { 
		return name;
	}
	
	public int getCritical() { 
		return CRITICAL;
	}
	
	public int getRangeIncrement() { 
		return RANGE_INCREMENT;
	}
	
	public String getType() { 
		return type;
	}
	
	public int getHardness() { 
		return HARDNESS;
	}
	
	public int getAbsCost() { 
		return cost.getAmount();
	}
	
	public String getCost() { 
		return cost.getAmountAndType();
	}
	
	public String getDamage() { 
		return DAMAGE.getDie();
	}
	
	public int getWeight() { 
		return WEIGHT;
	}
	
	public int getHP() { 
		return HP;
	}
}
