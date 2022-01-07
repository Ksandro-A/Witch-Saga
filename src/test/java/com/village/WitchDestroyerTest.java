package com.village;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WitchDestroyerTest {

	@Test
	void findAvarageKillstest() {
		
		try {
			WitchDestroyer witchDestroyer = new WitchDestroyer();
			Villager firstVillager = new Villager(190, 12);
			Villager secondVillager = new Villager(13, 17);
			double average = 0;
			average = witchDestroyer.findAverageKills(firstVillager, secondVillager);
			System.out.println(average);
			
			assertNotEquals(-1, average, "Average is -1");
		} catch (Exception ex) {
			fail("Exception:" + ex.getMessage());
		}
		
	}

}
