public enum Gender {
	/* Defining the relevant enums */
	MALE("Male"),
    FEMALE("Female");
    
	/* The description of gender */
	private String genderDescription;
	
    Gender(String genderDescription) {
    	this.genderDescription = genderDescription;
    }
    
    /* Get the string description of gender */
    public String getGender() {
    	return this.genderDescription;
    }
}
