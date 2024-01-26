package tests;

import static org.junit.Assert.*;
import model.Superhero;
import model.SupeLogic;
import org.junit.Before;
import org.junit.Test;

public class SupeLogicTest1 {
	String name_one = "Omni-Man";
	String power_one = "fly";
	int age_one = 2000;
	Superhero omniman = new Superhero(name_one,power_one,age_one);
	
	String name_two = "Invincible";
	int age_two = 18;
	Superhero invincible = new Superhero(name_two,age_two);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testReturnDescription() {
		assertEquals("Name: " + name_one + "\nPower: " + power_one + "\nAge: " + age_one, SupeLogic.returnDescription(omniman));
		assertEquals("Name: " + name_two + "\nAge: " + age_two,SupeLogic.returnDescription(invincible));
	}
	
	public void testNameNotNull() {
		assertNotNull(omniman.getName());
	}

}
