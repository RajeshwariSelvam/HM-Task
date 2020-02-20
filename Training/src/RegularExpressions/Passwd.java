package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
changes are requsted

public class Passwd {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the password to check correct or not: ");

		boolean found = false;
		while(true)
		{
			String pass = input.next();

			String passwd = "^(?=.+[A-Za-z])(?=.+[^A-Za-z0-9])(?=.*[0-9]).{4,}";
			
			//String passwd ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[^A-Za-z0-9]).{6,}";
			
			Pattern pattern = Pattern.compile(passwd);

			Matcher match = pattern.matcher(pass);		
			System.out.println(match.matches());

		}


	}

}
