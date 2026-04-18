package exam.codewriting.q4;

/*
 * We wish to create a Car class. A Car has-a(n):
 * 
 * Odometer, which tracks how many miles the car has been driven.
 * Fuel efficiency, typically given as miles-per-gallon.
 * Fuel tank, which can hold some amount of fuel, in gallons.
 * Current amount of fuel.
 */

public class Car {
	private int Odometer;
	private int efficiency;
	private int tank;
	private int fuel;

	public Car(int efficiency, int tank){
		this.Odometer = 0;
		this.efficiency = efficiency;
		this.tank= tank;
        this.fuel= 0;

	}
	
	/**
	* Drives the car at the given speed for the given amount of time or until out of fuel.
	* (Hint: Carefully consider the impact of driving to all instance variables).
	*/
	public void drive ( double milesPerHour , double hours ) {
		double DistanceNeed = milesPerHour * hours;
		double DistanceMax = fuel * efficiency;
		double actualDistance = Math.min(DistanceMax,DistanceNeed);

		Odometer += actualDistance;
		fuel -= actualDistance/efficiency;

	}
	
	public double getMilesDriven () {
		return Odometer;
	}
	
	/**
	* Adds fuel to the tank as long as it does not exceed the tank�s capacity.
	* @return portion of fuel that couldn�t be added
	*/
	public double addFuel ( double gallons ) {
		if (fuel + gallons <= tank){
			fuel+= gallons;
			return 0;
		}
		else{
			fuel = tank;
			return gallons-(tank-fuel);

		}
	

	}
	
	
}
