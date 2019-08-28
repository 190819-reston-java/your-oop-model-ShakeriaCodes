package myPlanets;

import java.io.Serializable;

public class Pluto extends Planets implements Serializable {

	public Pluto() {
		public static int distance = 0;

		public Pluto(String name, String color, boolean inRetrograde {
			super(name, color, inRetrograde);
			population++;
		}

		public Pluto(String name, String color) {
			this(name, color, true);
		}

		public Pluto(String name) {
			this(name, "charcoal");
		}

		public Pluto() {
			this("Dwarf Planet");
		}
		
		public static void printDistance() {
			if (distance == 0) {
				System.out.println("Far out");
			} else {
				System.out.println("There are: " + distance + " Pluto");
			}
		}

	}

}
