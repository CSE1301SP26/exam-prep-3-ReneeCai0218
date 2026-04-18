package exam.codewriting.q2;

/*
 * We wish to create a Planet class. A planet has-a(n):
		name
		mass
 */
public class Planet {
  private String name;
  private int mass;

public Planet(String name, int mass){
	this.name = name;
	this.mass = mass;
}
	// Define your instance variables here
	
	// Write the constructor for the Planet class
	
	public String getName () {
		return name;
	}
	
	public int getMass () {
		return mass;
	}
	
	public String toString () {
		return name+ " " + mass;
	}
	
	/**
	* When two planets collide, a new Planet should be created and returned.
	* The mass of the new planet should be the total mass of the two planets
	* involved in the collision, and it should be named after both planets.
	*/
	public Planet collide ( Planet other ) {
		String newName = this.name + "-" + other.name;
		int newMass = this.mass + other.mass;
		Planet a = new Planet(newName, newMass);
		return a;
	}
	
	
}
