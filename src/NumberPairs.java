import java.util.Scanner;

public class NumberPairs {

	public static void main(String[] args){
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Learn your squares and cubes!");
	// get an int from the user // declare and initialize your instance variables for use in application
	int numSquared = 0;
	int numCubed = 0;
	
	String choice = "y";
	while (choice.equalsIgnoreCase("y")){
		
		//prompts the user to enter an integer 
				System.out.println("Enter an integer:");
				int num=Integer.parseInt(scan.nextLine());
				System.out.println();
			
				if (num>0){
					// define the table and append the header rows
					String table = "";
					table += "Number\t square\tcube\n";
					table += "======\t======\t=======\n";
					
					// appends the rest of the rows to the table
					for (int i = 1; i <= num; i++){
						int squares = i * i;
						int cubes = i*i*i;
						table  += 1 + "\t" + squares + "\t" + cubes + "\n";
					}
					
					System.out.println(table);
					
				}
			
				System.out.println("Would you like to continue? (enter 'y' or 'n')");
				
				choice = scan.nextLine();
				System.out.println();	
				
				
	}
		
	  //if the user decides not to continue exit the for loop, close scanner.
    scan.close();
    System.out.println("Thanks for squares and cubes. Good bye!");
    
	
	}
}
