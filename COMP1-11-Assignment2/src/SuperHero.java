/**
 * 
 * @author chutc_000
 * @program Description: Assignment to make a super hero with super powers
 * @version:0.1
 * Assignment 2 Worth 5%
 * due February 6th
 * date modified:  February 2
 */
public class SuperHero extends Hero {
//private variables
	private int powerChoice;
	
	
	
	
	
//constructor
	public SuperHero(String name) {
		super(name);
		generateRandomPowers();
		
	}
//create String array in which we have 6 abilities, then generate a random number that chooses each at random
	private void generateRandomPowers(){
		
		//string array
		String[]superPowers = new String[]{
				"Super Speed",
				"Super Strength",
				"Stone SKin",
				"Flight",
				"Pyrokenisis",
				"Weather Control"};
	
		
		//System.out.println("Picking powers...");
		//generate a random number, pick that super power from the array and delete it, do it three times
		for(int i=0; i >=2; i++){
			this.powerChoice = (int)Math.random()*5;
			System.out.println("Power to be deleted: " +powerChoice);
			
		}
		//print the remaining super powers as the super powers that we want
		System.out.println("Powers+++++++++++++");
		for (String s: superPowers){
			
			System.out.printf("|%s|", s);
			System.out.println();
		}
	}
	

}
