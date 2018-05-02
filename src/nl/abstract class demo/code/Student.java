import java.util.ArrayList;
import java.util.Date;
/**
 * Student class extending
 * the abstract superclass Human.
 * 
 * @author George Argyrousis
 */
public class Student extends Human{
	
	/* The student ID */
	private String studentID;
	
	/* A list of grades */
	private ArrayList<Double> grades;
	
	/* A list of attending courses */
	private ArrayList<String> attendingCourses;

	/* Initialise all relevant components */
	public Student(String firstName, String lastName, Gender gender, Date birthdate, String studentID) {
		super(firstName, lastName, gender, birthdate);
		this.studentID = studentID;
		grades = new ArrayList<Double>();
		attendingCourses = new ArrayList<String>();
	}

	@Override
	public boolean isWorking() {
		/* add extra functionality as you see fit */
		return false;
	}
	
	/* Simple getters */
	
	public String getStudentID() { return this.studentID; }
	
	public ArrayList<Double> getGrades(){ return this.grades; }
	
	public ArrayList<String> getAttendingCourses(){ return this.attendingCourses; }

}
