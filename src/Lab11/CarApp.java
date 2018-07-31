package Lab11;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
  
        int userInput;
        
        System.out.println("Hello! Thanks For Viewing Our Inventory?");
        
        ArrayList <Car> Cars = new ArrayList<>(); 
        
        Cars.add(new Car ("Audi", "A7", 2019, 89999));
        Cars.add(new Car ("Toyota", "Avalon", 2019, 37529));
        Cars.add(new Car ("Cadillac", "GT6", 2019, 45887));
        Cars.add(new UsedCar ("Porshe", "Cayenne", 2007, 15000, 257000));
        Cars.add(new UsedCar ("Mercedes", "CLA250", 2011, 25000, 89000));
        Cars.add(new UsedCar ("Buick", "Lacrosse", 2005, 7000, 100000));
       
       for (int i = 0; i < Cars.size(); i++) {
            System.out.println(i + 0 + " " + Cars.get(i));
       }
       System.out.println("Which Car Would You Like?");
        userInput = scnr.nextInt();  

        System.out.println("Would you like to buy this car?");
        String userChoice = scnr.nextLine().trim();
        
        System.out.println(Cars.get(userInput));
        userInput = scnr.nextInt(); 
    
 
		if ("y".equalsIgnoreCase(userChoice)) {
			 System.out.println("Excellent! Our finance department will be in touch shortly.\n");
			 
        } else if ("list".equalsIgnoreCase(userChoice)) {
            System.out.println(userChoice);
        } else if ("add".equalsIgnoreCase(userChoice)) {
            doAdd(scnr, userChoice);
            System.out.println(userChoice);
        } else if ("remove".equalsIgnoreCase(userChoice)) {
            doRemove(scnr, userChoice);
            System.out.println(userChoice);
        } else {
            System.out.println("Sorry. That's an invalid option.");
        } 
		
		scnr.close();
    }
	private static void doAdd(Scanner scnr, String userChoice) {
	}
	private static void doRemove(Scanner scnr, String userChoice) {
		
	}
}



