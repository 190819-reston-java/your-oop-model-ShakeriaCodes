package myPlanets;

public abstract class AbstractPlanet {

	public AbstractPlanet() {
		
		public static int distance = 0;
		
		private String name;
		private String size;
		private boolean inRetrograde;
		
		//chaining overloaded constructors
		
		public planet(String name, String size, boolean retrograde) {
			super();
			this.name = name;
			this.size = size;
			this.inRetrograde = inRetrograde;
		}
		
		public planet(String name, String size) {
			this(name, color, true);
		}
		
		public planet(String name) {
			this(name, "Mercury");
		}
		
		public planet() {
			this("Mercury");
		}

		public void orbit() {
			System.out.println(this.name + " is spinning!");
		}
		
		public void temperature() {
			System.out.println(this.name + " is hot!");
		}
		
		public abstract void sitStill();
		
		public abstract void tryEat();

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public boolean isinRetrograde() {
			return inRetrograde;
		}

		public void setiRetrograde(boolean inRetrograde) {
			this.inRetrograde = inRetrograde;
		}

	}

	

