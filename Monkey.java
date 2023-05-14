//This a Monkey class
public class Monkey extends RescueAnimal {
	//Instance variable
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	//Default Constructor
	public Monkey(String name, String tailLength, String height, String bodyLength, String species,  String gender, String age,
		    String weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry) {
		setName(name);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
		
	}
	//Accessor Method 
	public String getTailLength() {
		return tailLength;
	}
	
	//Mutator Method
	public void setTailLength(String monkeyTail){
		tailLength = monkeyTail;
	}
	
	//Accessor Method 
	public String getHeight() {
		return height;
	}
	
	//Mutator Method
	public void setHeight(String monkeyHeight) {
		height = monkeyHeight;
	}
	
	//Accessor Method
	public String getBodyLength() {
		return bodyLength;
	}
	
	//Mutator Method
	public void setBodyLength(String monkeyBodyLength) {
		bodyLength = monkeyBodyLength;
	}
	
	//Accessor Method 
	public String getSpecies() {
		return species;
	}
	
	//Mutator Method 
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
	}
}
