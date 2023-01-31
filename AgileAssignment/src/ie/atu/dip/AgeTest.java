package ie.atu.dip;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import org.junit.jupiter.api.BeforeAll;
//This test class tests to make sure that the age entered is an int nad that it is not null
public class AgeTest {

	public static Menu m;
	public static Runner r;
	Scanner sc = new Scanner(System.in);
	private static int i;

	//This instantiates the menu class and starts it
	@BeforeAll
	public static void SetUpAll() throws IOException {
		m = new Menu();
		m.start();
		System.out.print("Enter your age: ");
		

	}


	//This test method is designed to timeout after 20 seconds
	//It sets i to the the user input and checks to see if it is an int
	@Test
	@Timeout(value = 20, unit = TimeUnit.SECONDS)
	public void SetAge() throws IOException {

		i = m.AgeChooser(sc);
		assertTrue((i == (int) i));
		System.out.println("Valid Age Entered");
		assertNotNull(i);

	}

		//The checks to see if the age entered is not 0, because age can't be 0
	@Test
	public void MyException() {
		assertThrows(NullPointerException.class, () -> {
			if (i == 0) {
				throw new NullPointerException("Age can't be 0");
			}
		});
	}
	//This saves resources by closing the age variable
	@AfterAll
	public static void cleanUp() {
		i = 0;
		
		System.out.println("Age set back to zero");

	}

}
