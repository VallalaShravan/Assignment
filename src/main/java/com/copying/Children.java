package com.copying;


public class Children {

	String name;
	String surname;
	String gowthram;
	String hometown;
	public static void main(String[] args) {
	/*
	 * whatever Properties and behavior related to Parent will be inherited here 
	 * we can access class properties by creating Object 
	 * */
		Parent parent = new Parent("vallala","koundinya","warangal",2);
		Children nextGeneration = new Children();
		nextGeneration.surname= parent.surname;
		nextGeneration.gowthram= parent.gowthram;
		nextGeneration.hometown = parent.hometown;
		System.out.println("Surname (child): "+nextGeneration.surname);
		System.out.println("Gowthram  (child): "+nextGeneration.gowthram);
		System.out.println("Location  (child): "+nextGeneration.hometown);
		System.out.println("Other Class Properties and Behaviour");
		parent.retrieveInfo();
	}


	
}
