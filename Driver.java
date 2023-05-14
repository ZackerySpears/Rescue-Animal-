import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    //Add a monkey Array list
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    //This is a scanner to get user input
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
    	//Initialize variables 
    	String userInput;
    	
        initializeDogList();
        initializeMonkeyList();

       //Do-While loop to access menu
       do{
    	   //Display the menu
    	   displayMenu();
    	   //Get the user input 
    	   userInput = scanner.nextLine();
    	   //Switch through each option the user can choose
    	   switch(userInput) {
    	   		case "1":
    	   			intakeNewDog(scanner);
    	   			break;
    	   		case "2":
    	   			intakeNewMonkey(scanner);
    	   			break;
    	   		case "3":
    	   			reserveAnimal(scanner);
    	   		case "4":
    	   			printAnimals(userInput);
    	   			break;
    	   		case "5":
    	   			printAnimals(userInput);
    	   			break;
    	   		case "6":
    	   			printAnimals(userInput);
    	   			break;
    	   		case "q":
    	   			break;
    	   		default:
    	   			System.out.println("Invalid input, please try again. Enter 1-6 or q to quit.");
    	   }
        }while(!userInput.equals("q"));

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }
    

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service",true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkeyOne = new Monkey("DK", "3", "7", "15", "Guenon", "male", "4", "15", "4-1-22", "Japan", "intake", true, "USA");
    	//Adds a new monkey to the ArrayList
    	monkeyList.add(monkeyOne);

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
    	// Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
       
        //Make sure the gender is male or female
        String gender;
        do {
        	  System.out.println("What is the dog's gender?");
              gender = scanner.nextLine().toLowerCase();
        }while (!gender.equals("male") && !gender.equals("female")); 
        
        
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        
        System.out.println("When was the dog's acquired?");
        String acquisitionDate = scanner.nextLine();
        
        System.out.println("Where was the dog acquired?");
        String acquisitionCountry = scanner.nextLine();
        
        System.out.println("What is the dog training status?");
        String trainingStatus = scanner.nextLine();
        
        
        System.out.println("In what country is the dog in service?");
        String inServiceCountry = scanner.nextLine();
        
        
        System.out.println("Is this dog reserved? True or False.");
        String reservedSpot;
        reservedSpot = scanner.nextLine();
        System.out.println("reservedString: " + reservedSpot);
        boolean reserved;
        //This is a for loop that checks if the animal is already in the system
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("This dog is already in our system");
                return; //returns to menu
            }
            //Makes sure the user answer is true or false
            if(!"true".equals(reservedSpot) && !"false".equals(reservedSpot)) {
                System.out.println("Re-input reservation status.");
                reservedSpot = scanner.nextLine();
             }
             
        }//Makes sure the user input is lower case 
        reserved = "true".equals(reservedSpot.toLowerCase());
        //This creates a new dog from user input 
       Dog dog = new Dog(name, gender, age, weight, acquisitionDate, acquisitionCountry,trainingStatus ,inServiceCountry, reserved, inServiceCountry);
        
       //Print out after the dog has been added to the system 
       System.out.println("The dog has successfully been added to our system.");
        //This adds the dog to the arrayList called dogList
        dogList.add(dog);
      //Returns back to menu
        return;
        
    }


        // Completed intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
    //Made sure there could be no repeat of Monkeys
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
            	if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system.\n\n");
                    return; //returns to menu
                }
            }
            
            System.out.println("What is the monkey's tail lenght?");
            String tailLength = scanner.nextLine();
            
            System.out.println("What is the monkey's height?");
            String height = scanner.nextLine();
            
            System.out.println("What is the monkey's body Length?");
            String bodyLength = scanner.nextLine();
            
            //Do while loop to get the monkey species
            String species;
            do {
            	System.out.println("What is the monkey's species?");
            	System.out.println("Species:Capuchin, Guenon, Macaque, Marmose, Squirrel monkey, Tamarin");
            	species = scanner.nextLine();
            }while(!"Capuchin".equals(species) && !"Guenon".equals(species) && !"Macaque".equals(species) && !"Marmose".equals(species) &&
            		!"Squirrel monkey".equals(species) && !"Tamarin".equals(species));
            
            //Makes sure the gender is either male or female
            String gender;
            do {
            	  System.out.println("What is the monkey's gender?");
                  gender = scanner.nextLine().toLowerCase();
            }while (!gender.equals("male") && !gender.equals("female"));
            
            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();
            
            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();
            
            System.out.println("When was the monkey's acquired?");
            String acquisitionDate = scanner.nextLine();
            
            System.out.println("Where was the monkey acquired?");
            String acquisitionCountry = scanner.nextLine();
            
            System.out.println("What is the monkey training status?");
            String trainingStatus = scanner.nextLine();
            
            String booleanString;
            System.out.println("Is this monkey reserved? True or False.");
            
            booleanString = scanner.nextLine();
            //Make sure user input is either true or false
            while (!booleanString.equalsIgnoreCase("true") && !booleanString.equalsIgnoreCase("false")) {
            	System.out.println("Re-input reservation status.");
            	booleanString = scanner.nextLine();
            }//Makes the user input true
            boolean reserved = "true".equals(booleanString.toLowerCase());
     
            
            System.out.println("In what country is the monkey in service?");
            String inServiceCountry = scanner.nextLine();
            
            //This creates a new monkey from user input 
            Monkey monkey = new Monkey(name, tailLength, height, bodyLength, species,
            		gender ,age, weight, acquisitionDate, acquisitionCountry,trainingStatus ,reserved, inServiceCountry);
            
            //This adds the monkey to the arrayList called monkeyList
            monkeyList.add(monkey);
            //Print out after the monkey has been added to the system 
            System.out.println("The monkey has successfully been added to our system.");
            return;
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	 System.out.println("Enter name of animal: ");
        	 String animalType = scanner.nextLine();
        	 //This is a for loop that checks to see if the dog is reserved in the system or not.
        	 for (Dog dog : dogList) {
        		 if(dog.getName().equalsIgnoreCase(animalType)) {
        	           if (dog.getReserved()) {
        	        	   System.out.println("Cannot reserve this dog is already in our system.");
              			 return;  
        	           }
        	           else {
              			 dog.setReserved(true);
              			 System.out.println("This dog has been successfully reserved in our system.");
              			 return;
              		 }
        		 	}       			       	      	 
        	 }
        	//This is a for loop that checks to see if the monkey is reserved in the system or not.
        	 for (Monkey monkey : monkeyList) {
        		 if (monkey.getName().equalsIgnoreCase(animalType)) {
        			 if (monkey.getReserved()) {
        				 System.out.println("Cannot reserve this monkey is already in our system.");
        				 return;
        			 }
        			 else {
                         monkey.setReserved(true);
                         System.out.println("This monkey has been successfully reserved in our system.");
                         return;
        			 }
        		 }
        	 }
        	 System.out.println("Cannot find animal in our system.");
        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String userInput) {
        	if(userInput.equals("4")) {//Checks the user input 
        		System.out.println("All the dog's");
        	//Loops over the dog list and prints out there name, training status and acquisition location
        		for (int i = 0; i < dogList.size(); ++i) {
        			System.out.println(dogList.get(i).getName() + " " + dogList.get(i).getTrainingStatus() + " " + dogList.get(i).getAcquisitionLocation());
        		}
        		return;
        		
        }
        else if (userInput.equals("5")) {//Checks the user input 
        	System.out.println("All the monkey's");
        	//Loops over the dog list and prints out there name, training status and acquisition location
    		for (int i = 0; i < monkeyList.size(); ++i) {
    			System.out.println(monkeyList.get(i).getName() + " " + monkeyList.get(i).getTrainingStatus()+ " " + monkeyList.get(i).getAcquisitionLocation());
    		}
    		return;
        }
        else if (userInput.equals("6")) {
        	//This for loop checks to see all the dog's who are not reserved currently
        	System.out.println("Printing all not reserved.");
        	for (int i = 0; i < dogList.size(); i++) {
        		if (dogList.get(i).getReserved()) {
        			System.out.println(dogList.get(i).getName() + " " + dogList.get(i).getTrainingStatus() + " " + dogList.get(i).getAcquisitionLocation());
        		}
        	}//This for loop checks to see all the monkey's who are not reserved currently
        	for (int i = 0; i < monkeyList.size(); i++) {
        		if (monkeyList.get(i).getReserved()) {
        			System.out.println(monkeyList.get(i).getName() + " " + monkeyList.get(i).getTrainingStatus()+ " " + monkeyList.get(i).getAcquisitionLocation());

        		}
        	}
        	 

        	 }
        
     }
}

