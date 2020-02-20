package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//String s = input.nextLine();
		
		
		
		Pattern pattern = Pattern.compile("abc");
		
		Matcher match = pattern.matcher("abcdefabccba");
		
//	boolean mat = match.matches();
//		
//		System.out.println(mat);
		
		while(match.find())
		{
			System.out.println("Found the text " + match.group() + " Starting at index " + match.start() + " Ending at index " + (match.end()-1));//+" start "+ match.start() + " end " + match.end());
		}
		
		
	}

}
