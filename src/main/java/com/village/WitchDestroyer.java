package com.village;

public class WitchDestroyer {


	// Method to find the average number of people the witch killed on year of birth of those people
	public double findAverageKills(Villager firstVillager, Villager secondVillager) {
		double averageKills = -1;

		int firstVillagerKills = getKills(firstVillager);
		int SecondVillagerKills = getKills(secondVillager);
		System.out.println("firstVillagerKills -> " + firstVillagerKills);
		System.out.println("SecondVillagerKills -> " + SecondVillagerKills);
		if(firstVillagerKills > 0 && SecondVillagerKills > 0) {
			averageKills = (firstVillagerKills + SecondVillagerKills)/2.0;
		}

		
		System.out.println("avarageKills -> " + averageKills);
		return averageKills;
	}



	// Method to get the kills per villager
	public int getKills(Villager villager) {

		int years = 0;
		int kills = 0;

		if(villager != null) {
			years = villager.getDeathYear() - villager.getDeathAge();
		}

		if(years < 0 ) {
			return -1;
		}

		if(villager != null ) {
			if(villager.getDeathAge() < 0 || villager.getDeathYear() < 0 ) {
				return  -1;
			}
		}
		kills = killCalculator(years);

		return kills;
	}


	// Method to calculate the kills given the years
	public int killCalculator(int Controlyears) {

		int years = Controlyears, firstKill = 0, secondKill = 1;
		int totalKills = 0;

		for (int i = 0; i < years; ++i) {

			int nextKill = firstKill + secondKill;
			firstKill = secondKill;
			secondKill = nextKill;
			System.out.print(firstKill + " + ");
			totalKills += firstKill;
		}

		System.out.println(totalKills);

		return totalKills;
	}
}
