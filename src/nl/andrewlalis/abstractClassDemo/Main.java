package nl.andrewlalis.abstractClassDemo;

import java.util.Date;

/**
 * The main class in the abstract
 * class demonstration.
 * 
 * @author George Argyrousis
 */
public class Main {
	
	/* Student for this demonstration */
	private static Student george;
	
	/* Main class, instantiating the student */
	public static void main(String argsp[]) {
		george = new Student("George", "Argyrousis", Gender.MALE, new Date(), "S<number>");
		printStudentAttributes(george);
	}
	
	/* printing a student's attributes */
	private static void printStudentAttributes(Student student) {
		System.out.println("Student number : " + student.getStudentID());
		System.out.println("Student name : " + student.getFirstName() + " " + student.getLastName());
		System.out.println("Student was born : " + student.getBirthDate() + " and his gender is : " + student.getGender());
	}
}
