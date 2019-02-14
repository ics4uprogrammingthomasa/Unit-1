/*
 * Created By: Thomas Aubin
 * Created On: February 1, 2019
 * Course: ICS4UR
 * Daily Assignment - Day 
 * This program prints out "Hello World" to terminal with end notes
 */

public class HelloWorld {
	public static void main(String[] args) {
		
		// Create string variables
		String firstWord = "Hello";
		String secondWord = " World!";
		String closer = "Created By";
		String name = "Thomas Aubin";
		String course = "Course: ICS4UR";
		
		// Print out text to terminal
		System.out.println(firstWord + secondWord);
		System.out.println();
		System.out.println(closer + " " + name + "          " + course);
	}
}