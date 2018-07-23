import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	String cont = "y"; 
	int userNum = -1; //test to make sure that code is working if -1 us returned something went wring
	
	while (cont.equalsIgnoreCase("y" )) {
		//this is where your logic should start
		try {
		System.out.println("Please enter a whole number: ");
		userNum = scan.nextInt();
			
		
		if(userNum <0) {
			scan.nextLine(); // garbage line if they enter a num less than 0
			throw new Exception("Number must be greater than 0");
		}
		
		
		
		System.out.println(userNum);
	} catch (InputMismatchException e) { //since Inputmismatchexception is not in lang package, need to import
		// when in doubt use specific exceptions
//			System.out.println("Start Stacktrace");
//			e.printStackTrace(); // this will show the exception name thrown 
//			System.out.println("End Stacktrace");
			
			System.out.println("Please enter a valid number!");
			
			//add a garbage line to consume the improper input
			scan.nextLine();
			continue; //takes us back to the top of the loop w/o executing the code below
		} 	catch (Exception e) {
			System.out.println(e.getMessage()); 
		}
		
		
		//this is where your logic should stop
		System.out.println("Do you want to continue?(y/n)");
		//going from int to string, so need to add garbage line, if using
		//cont = scan.next() then it will be fine without garbage line
		scan.nextLine(); // garbage line bc we are going from int to string
		cont = scan.nextLine(); 
	}
	
	System.out.println("Goodbye!");
	
	scan.close();

	} 

}
