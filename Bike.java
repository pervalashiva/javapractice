package utils;

public class Bike {
	
	String color;
	int speed;
	
	// constructer
	public Bike(String c, int s) {
		
		color = c;
		speed = s;
	
	}

	public void showDetails() {
	System.out.println("Color: " + color);
	System.out.println("Spee: " + speed);

	}

}
