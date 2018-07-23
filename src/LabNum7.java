import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LabNum7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a valid Name: ");
		String name = scan.nextLine();
		checkName("[A-Z]\\w{1,29}\\s[A-Z]\\w{1,29}", name);
		// calling checkName method

		System.out.println("Please enter a valid email: ");
		String email = scan.next();
		checkEmail("[A-z0-9]{5,30}[\\s.@][A-z0-9]{5,10}[\\s..][A-z0-9]{2,3}$", email);
		// calling checkEmail method

		System.out.println("Please print phone number in xxx-xxx-xxxx format");
		String phone = scan.next();
		checkPhone("^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", phone);
		// calling checkPhone method

		System.out.println("Please enter a valid date (DD/MM/YYYY)");
		String date = scan.next();
		checkDate("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$", date);
		// calling checkDate method

	}

	public static void checkName(String regex, String sentence) {

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(sentence);
		
		//using matches method within the matcher class
		if (m.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

	public static void checkPhone(String regex, String sentence) {

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(sentence);
		// find() - attempts to locate the next subsequence of the input that matches
		// the pattern

		if (m.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

	}

	public static void checkDate(String regex, String sentence) {

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(sentence);

		if (m.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");

		}
	}

	public static void checkEmail(String regex, String sentence) {

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(sentence);

		if (m.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");

		}
	}

}
