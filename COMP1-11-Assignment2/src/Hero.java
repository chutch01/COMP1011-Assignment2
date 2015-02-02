/**
 * 
 * @author chutc_000
 * @program Description: Assignment to make a super hero with super powers
 * @version:0.1
 * Assignment 2 Worth 5%
 * due February 6th
 * date modified:  February 2
 */
public class Hero {
//private variables
	
	private int strength;
	private int speed;
	private int health;
	private int hit;
	private int hitAmount;
	
//public variables	
	public String name;

//constructor
public Hero(String name){
	this.name = name;
	generateAbilities();
}

//public methods

/*
 * public method that will let the hero fight, and run the hitAttempt method
 * 
 */
public void fight() {
	
	
	if (hitAttempt() == true){
		hitDamage();
	}
}
/*
 * public method that will print out the hero's stats
 */
public void showAbilites(){
System.out.println("+++++++++++++++++++");
System.out.println("Strength: " + this.strength);
System.out.println("Speed: " + this.speed);
System.out.println("Health: " + this.health);
System.out.println("+++++++++++++++++++");
}

//private methods
/*
 * private method that will generate the ability stats
 */
private void generateAbilities(){
	this.strength = (int)(Math.random() * 100 +1);
	this.speed = (int)(Math.random() * 100 +1);
	this.health = (int)(Math.random() * 100 +1);
}
/*
 * private method that will attempt to make a hit. if it does,
 * run the damage amount, if not, print a "miss" message
 */
private boolean hitAttempt(){
	this.hit = (int)(Math.random()*100 +1);
	//System.out.println(hit); HIT ROLL TEST
	//if above or equal to 80, hit
	if (hit >= 80){
		System.out.println(this.name + " successfully hit the target!");
		return true;
	}
	//if below 80, miss
	else{
		System.out.println(this.name + " missed!");
		return false;
	}
}
/*
 * private method that calculates the damage done
 */
private void hitDamage(){
	//runs if critical
	if (hit == 100){
		System.out.println("Critical Hit!");
		this.hitAmount = 6*this.strength;
		System.out.println(this.name +" hit for " + this.hitAmount + " damage!");
	}
	//runs if not critical
	else{
		this.hitAmount = (int)(Math.random()*6 +1) * this.strength;
		System.out.println(this.name +" hit for " + this.hitAmount + " damage!");
	}
}
}

