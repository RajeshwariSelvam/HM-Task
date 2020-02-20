package learnings;
// A Simple Java program to demonstrate working of 
// String matching in Java 
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

class Demo 
{ 
	public static void main(String args[]) 
	{ 
		// Create a pattern to be searched 
		Pattern pattern = Pattern.compile("ge*ks"); 

		// Search above pattern in "geeksforgeeks.org" 
		Matcher m = pattern.matcher("gksforgeeksorg"); 

	boolean p = pattern.matches("[a-c[x-z]]*d","d" );
		
	System.out.println(p);
	// Print starting and ending indexes of the pattern 
		// in text 
		while (m.find()) 
			System.out.println("Pattern found from " + m.start() + 
							" to " + (m.end()-1)); 
	} 
} 
