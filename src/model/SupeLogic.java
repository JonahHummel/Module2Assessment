package model;

public class SupeLogic {
	
	public static String returnDescription(Superhero superhero) {
		String name = superhero.getName();
		String power = superhero.getPower();
		int age = superhero.getAge();
		if (superhero.getPower() != null) {
			return "Name: " + name + "\nPower: " + power + "\nAge: " + age;
		}
		else {
			return "Name: " + name + "\nAge: " + age;
		}
	}
	public static String usePower(Superhero superhero) {
		// couple of examples of powers
		if(superhero.getPower().equalsIgnoreCase("fly")) {
			return "Wooooooosh!";
		}
		else if(superhero.getPower().equalsIgnoreCase("laser vision")) {
			return "PEWWWWW";
		}
		// for time sake not adding more but this is the placeholder for any other powers
		else {
			return "BAM!";
		}
	}
	
}
