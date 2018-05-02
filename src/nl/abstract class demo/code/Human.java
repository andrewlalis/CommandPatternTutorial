import java.util.Date;

/**
 * Abstract class to illustrate
 * why we would extantiate an 
 * abstract class over a regural
 * class.
 * 
 * @author George Argyrousis
 */
public abstract class Human {
	
	/* The first Name of a person */
	private String firstName;
	
	/* The last Name of a person */
	private String lastName;
	
	/* The person's gender */
	private Gender gender;
	
	/* The date that the peson was born */
	private Date birthdate;

	/* Initialising all relevant components */
	public Human(String firstName, String lastName, Gender gender, Date birthdate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthdate = birthdate;
	}
	
	/* Method that needs to be implemented in the immedeate subclass */
	public abstract boolean isWorking();
	
	/* Simple getters. */
	
	public String getFirstName() { return this.firstName; }
	
	public String getLastName() { return this.lastName; }
	
	public String getGender() { return this.gender.getGender(); }
	
	public String getBirthDate() { return this.birthdate.toString(); }
}


