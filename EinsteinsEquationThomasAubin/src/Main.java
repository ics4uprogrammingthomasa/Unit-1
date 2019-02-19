// Add scanner library
import java.util.Scanner;

/*
 * Created by: Thomas Aubin
 * Created on: February 12, 2019
 * Created for: ICS4U
 * Day #4 (Einstein's Equation)
 * This program calculates how much energy could be released from user's inputed mass
*/

public class Main {
	// Declare variables
	static double userInput;
	static double energyReleased;
	static double SPEEDOFLIGHT = 299792458;
	
	public static void main(String[] args) {
		// Create console reader object
		Scanner reader = new Scanner(System.in);
						
		// Ask the user mass size
		System.out.println("What's the mass of your object in kg?");
				
		// Save users input
		try {
			// Save user input
			userInput = reader.nextDouble();
		}
		// If an error occurs, tell the user to input a proper mass (Number)
		catch(Exception e) {
			// Tell the user to input a proper mass
			System.out.println("Please input a proper mass");
		}
		
		// Close reader
		reader.close();
		
		// Calculate energyReleased with set mass
		energyReleased = userInput * Math.pow(SPEEDOFLIGHT, 2);
		
		// Tell user energyReleased
		System.out.println("Max energy released is " + energyReleased + " J");
	}
}
