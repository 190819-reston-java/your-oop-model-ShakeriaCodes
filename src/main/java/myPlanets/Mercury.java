package myPlanets;

import java.io.Serializable;

public class Mercury extends Planets implements Orbit, Serializable {

	public Mercury() {
		public Mercury(String name, String color, boolean inRetrograde) {
			super(name, color, inRetrograde);
			distance++;
		}

		public Mercury(String name, String color) {
			super(name, color);
			distance++;
		}

		public Mercury(String name) {
			super(name);
			distance++;
		}

		public Mercury() {
			distance++;
		}

		public void spins() {
			System.out.println(this.getName() + " is spinning!");

		}
	}

}
