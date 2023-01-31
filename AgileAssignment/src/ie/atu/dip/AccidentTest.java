package ie.atu.dip;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

//This class checks to see that the number of accidents entered is a valid int
class AccidentTest {
	public static Menu m;
	Scanner sc = new Scanner(System.in);
	private static int j;
	//This instantiates the Menu class
	@BeforeAll
	public static void SetUpAll() {
		m = new Menu();
	}

	//This is a simple test method which prints out information to the console
	@BeforeEach
	public void SetUp() {

		System.out.print("\nHow many accidents did you have? ");
	}

	
	//This test method is designed to timeout after 20 seconds
	//It sets j to the the user input and checks to see if it is an int
	@Test
	@Timeout(value = 20, unit = TimeUnit.SECONDS)
	void test() throws IOException {
		// m.start();
		j = m.NumofAccidents(sc);
		assertTrue((j == (int) j));
		System.out.println("Valid Number of Accidents Entered");
		assertNotNull(j);

	}
	
	//As this is the last test class, this test method closes the scanner to prevent resource leak
	@AfterEach
	public void cleanUpEach() {
		sc.close();
		System.out.println("Scanner closed");
	}

	//This saves resources by closing the accidents variable
	@AfterAll
	public static void cleanUp() {
		j = 0;
		System.out.println("Number of Accidents set back to zero");

	}

}
