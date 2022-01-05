package com.village;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WitchDestroyerTest {

	@Test
	void test() {
		
		try {
			WitchDestroyer witchDestroyer = new WitchDestroyer();
			Villager firstVillager = new Villager(190, 12);
			Villager secondVillager = new Villager(13, 17);
			Double avarage = (double) 0;
			avarage = witchDestroyer.findAvarageKills(firstVillager, secondVillager);
			System.out.println(avarage);
			assertNotNull(avarage,"Avarage is null");
			//Assert.assertNotNull("Avarage is null", avarage);
			
		} catch (Exception ex) {
			fail("Exception:" + ex.getMessage());
		}
		
	}

}
