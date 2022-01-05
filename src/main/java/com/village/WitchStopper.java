package com.village;

public class WitchStopper {

	
	public static void main(String[] args){

		WitchDestroyer witchDestroyer = new WitchDestroyer();
		Villager firstVillager = new Villager(10, 12);
		Villager secondVillager = new Villager(13, 17);
		double avarage = 0;
		avarage = witchDestroyer.findAvarageKills(firstVillager, secondVillager);

		System.out.println(avarage);

	}
}
