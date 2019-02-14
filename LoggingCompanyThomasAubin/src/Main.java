/*
 * Created by: Thomas Aubin
 * Created on: February 8, 2019
 * Created for: ICS4U
 * Day #3 (Logging Company)
 * This program calculates how many logs can fit onto a truck regarding weight
*/

// Add console reader library
import java.util.Scanner;

public class Main {
	// Declare variables
	static double SMALLLOG= 0.25;
	static double MEDIUMLOG = 0.5;
	static int LARGELOG = 1;
	static int LOGWEIGHTPERMETER = 20;
	static int MAXTRUCKWEIGHT = 1100;
	static double userInput;
	static double logWeight;
	static double logsOnTruck;
	
	// 'main' function which is called first
	public static void main(String[] args) {
		// Call 'StartProgram' function
		GetInput();
	}
	
	// Function to get user's input
	public static void GetInput() {
		// Create console reader object
		Scanner reader = new Scanner(System.in);
				
		// Ask the user for log size
		System.out.println("How long are the logs in meters?");
		
		// Check if input is a number
		try {
			// Save user input
			userInput = reader.nextDouble();
		}
		catch(Exception e) {
			// Tell the user to input a proper length
			System.out.println("Please input a proper log length");
		}
		
		// Close reader
		reader.close();
		
		// If log size is 0.25m
		if(userInput == 0.25) {
			// Calculate how many logs fit that are 0.25m
			Calculations();
		}
		// If log size is 0.5m
		else if(userInput == 0.5) {
			// Calculate how many logs fit that are 0.25m
			Calculations();
		}
		// If log size is 1m
		else if(userInput == 1) {
			// Calculate how many logs fit that are 1m
			Calculations();
		}
		// If any other size is inputed
		else {
			// Tell the user to input a proper length
			System.out.println("Please input a proper log length");
		}
	}
	
	// Function for calculations
	public static void Calculations() {
		// Find weight per meter
		logWeight = userInput * LOGWEIGHTPERMETER;
		// Find how many logs can fit on the truck
		logsOnTruck = MAXTRUCKWEIGHT / logWeight;
								
		// Print out max logs on truck
		System.out.println("With " + userInput + "m logs, you can fit " + logsOnTruck + " logs on the truck"); 
	}
}