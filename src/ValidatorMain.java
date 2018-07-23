import java.util.Scanner;

public class ValidatorMain {
	// examples for calling a method from diff class

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = Validator.getString(scan, "Please enter your name"); // calling getString method
		System.out.println(name);

		int num = Validator.getInt(scan, "Please enter a number"); // calling getInt method
		System.out.println(num);
		
		int userRange = Validator.getInt(scan, "Please enter number btwn 1 & 10", 1, 10);
		System.out.println(userRange);
		
		double userDouble = Validator.getDouble(scan, "Please enter a floating point number");
		System.out.println(userDouble); //int to double will be fine (no casting needed)
		
		double doubleRange = Validator.getDouble(scan, "Please enter a value btwn 1.5 and 20.25", 1.5, 20.25);
		System.out.println(doubleRange);
		
	} 

}
