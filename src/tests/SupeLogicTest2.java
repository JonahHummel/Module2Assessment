package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.SupeLogic;
import model.Superhero;

public class SupeLogicTest2 {
	
	String name_one = "Omni-Man";
	String power_one = "fly";
	int age_one = 2000;
	Superhero omniman = new Superhero(name_one,power_one,age_one);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testUsePower() {
		assertTrue(SupeLogic.usePower(omniman).equals("Wooooooosh!"));
	}

}
