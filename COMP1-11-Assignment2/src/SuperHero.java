/**
 * 
 * @author chutc_000
 * @program Description: Assignment to make a super hero with super powers
 * @version:0.1
 * Assignment 2 Worth 5%
 * due February 6th
 * date modified:  February 2
 */
import java.util.Random;

public class SuperHero extends Hero {
//constructor
	public SuperHero(String name) {
		super(name);
		System.out.println("picking powers");
		generateRandomPowers();
		
	}
//create String array in which we have 6 abilities, then generate a random number that chooses each at random
	public void generateRandomPowers(){
		String[]superPowers = new String[]{
				"Super Speed",
				"Super Strength",
				"Stone SKin",
				"Flight",
				"Pyrokenisis",
				"Weather Control"};
	
		
		System.out.println("Picking powers...");
		
		for (String s: superPowers){
			System.out.printf("|%s|", s);
			System.out.println();
		}
	}
	

}
