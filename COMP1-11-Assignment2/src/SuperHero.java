/**
 * 
 * @author chutc_000
 * @program Description: Assignment to make a super hero with super powers
 * @version:0.1
 * Assignment 2 Worth 5%
 * due February 6th
 * date modified:  February 2
 */
import java.util.ArrayList;
import java.util.Random;

public class SuperHero extends Hero {

	public SuperHero(String name) {
		super(name);
		System.out.println("picking powers");
		generateRandomPowers();
		
	}

	public void generateRandomPowers(){
		Random powerChoice = new Random();
		String[]superPowers = new String[6];
		
		for (int i=0; i<superPowers.length; i++){
			superPowers[1] = "Super Speed";
			superPowers[2] = "Super Strength";
			superPowers[3] = "Stone Skin";
			superPowers[4] = "Flight";
			superPowers[5] = "Pyrokenisis";
			superPowers[6] = "Weather Control";
		}
		
		System.out.println("picking powers");
		System.out.println(superPowers);
	}
	

}
