import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
	// there are 3 ways to use Regex (regular expressions) in java
		
		//1st way
		Pattern p = Pattern.compile(".t"); // . represents a single character that follows after the dot
		Matcher m = p.matcher("at");
		
		boolean b = m.matches();
		System.out.println(b);
		
		
		//2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();
		System.out.println(b2);
		
		//3rd way -- using overloaded matches method
		boolean b3 = Pattern.matches(".s", "as");
		System.out.println(b3);

		System.out.println(Pattern.matches("abc"+, "abc"));
		System.out.println(Pattern.matches("\\d", "help"));  //digit
		
		System.out.println();
		System.out.println("Regex method call: ");
		
		String tester = "Antonella is testing stuff 06/04/83, 1570 Woodward Detroit 48226 (313)555-1212";
		checkRegex("\\d{5}",tester);	
		
		
		}
	
	
	public static void checkRegex(String regex, String sentence) {	
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(sentence);		
		// find() - attempts to locate the next subsequence of the input that matches the pattern
		
		while (m.find()) {
			//group()-returns the actual input subsequences
			if(m.group().length() != 0) { //length of pattern 
				System.out.println(m.group().trim());
			}
			System.out.println("Starting index: " + m.start());
			System.out.println("Ending index: "+ m.end());
		}
		
		
		
		
		
	}

}
