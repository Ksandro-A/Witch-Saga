package com.village;

public class Villager {

	private int deathAge;
	private int deathYear;


	public Villager () {

	}


	public Villager(int deathAge, int deathYear) {
		super();
		this.deathAge = deathAge;
		this.deathYear = deathYear;
	}


	public int getDeathAge() {
		return deathAge;
	}
	public void setDeathAge(int deathAge) {
		this.deathAge = deathAge;
	}
	public int getDeathYear() {
		return deathYear;
	}
	public void setDeathYear(int deathYear) {
		this.deathYear = deathYear;
	}



}
