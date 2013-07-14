package main;
import java.util.ArrayList;
import java.util.List;

import res.Money.Copper;
import res.Money.Gold;
import res.Money.Silver;
import weapons.Handaxe;
import entities.Player;


public class Main {

	public static List<Player> players;
	
	public static void main(String[] args) {
		players = new ArrayList<Player>();
		Player mark = new Player("Mark");
		mark.setSize("large");
		players.add(mark);
		Handaxe weapon = new Handaxe("Handaxe");
		System.out.println(weapon.getCost() + "\r\n" + weapon.getDamage());
	}

}
