package RegularExpressions;


import java.util.Scanner;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

class test2 
{ 
	public static void main(String args[]) 
	{
		while(true)
		{
			String email = "^[A-Za-z0-9]+"+"[._]?"+"([A-Za-z0-9]+)*" + "[@gmail.com]$";//+"([A-Za-z]{2,3})$";
			Scanner input = new Scanner(System.in);

			Pattern pattern = Pattern.compile(email);
			System.out.println("Enter the mail address to check vaild or not");
			String emailid = input.next();//+"@gmail.com";
			String domain = "@gmail.com";
			domain = emailid + domain;
			System.out.println(domain);
			Matcher match = pattern.matcher(domain); 
			System.out.println(match.matches());
		}
	} 
} 


