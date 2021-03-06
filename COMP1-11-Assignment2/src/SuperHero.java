/**
 * 
 * @author chutc_000
 * @program Description: Assignment to make a super hero with super powers
 * @version:0.1
 * Assignment 2 Worth 5%
 * due February 6th
 * date modified:  February 5
 */
import java.util.ArrayList;


public class SuperHero extends Hero {
//private variables
	private int powerChoice;
	private ArrayList<String> superPowers = new ArrayList<String>();
	
	
	
	
	
//constructor
	public SuperHero(String name) {
		super(name);
		generateRandomPowers();
		
	}
//create String array in which we have 6 abilities, then generate a random number that chooses each at random
	
	private void generateRandomPowers(){
		
		//create ArrayList of super powers
		
				superPowers.add("Super Speed");
				superPowers.add("Super Strength");
				superPowers.add("Stone Skin");
				superPowers.add("Flight");
				superPowers.add("Pyrokenisis");
				superPowers.add("Weather Control");
		
		//System.out.println("Picking powers...");
		//generate a random number, pick that super power from the array and delete it, do it three times
		for(int i=0; i <=2; i++){
			this.powerChoice = (int)(Math.random() *superPowers.size());
			//System.out.println("Power to be deleted: " +powerChoice);
			superPowers.remove(this.powerChoice);
			
		}
		//print the remaining super powers as the super powers that we want
		//System.out.println("Powers+++++++++++++");
		//System.out.println(superPowers);
	}
	//print the remaining super powers as the super powers that we want
	public void showPowers(){
		System.out.println("Powers+++++++++++++");
		System.out.println(superPowers);
	}
	

}
