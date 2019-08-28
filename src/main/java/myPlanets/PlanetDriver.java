package myPlanets;

import java.io.Serializable;

public class PlanetDriver implements Serializable {

	public static void main(String[] args) {
		
		System.out.println(new Mercury());
		
		Pluto.printDistance();
		
		System.out.println(new Pluto());
		
		Pluto.printDistance();
		Pluto b = new Pluto();
		b.sing();
		
		Planets c = new Pluto();
		c.sitStill(); // Pluto method
		System.out.println(c.distance); //Planet pop
		System.out.println(((Pluto) c).distance); //Pluto pop
		
		//Serializable thingToSave = new Pluto();
			

	}

}
