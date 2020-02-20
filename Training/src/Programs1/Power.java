package Programs1;

//import java.util.Scanner;

public class Power {
	static int sum =0;
	
	//static int k=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Scanner s = new Scanner(System.in);
		int k;
      String s1 = "1234";//s.next(); 
      int l = s1.length();
        System.out.println(l);
    //  System.out.println((int)Math.pow(2, 5));
	for(int i =0;i<l;i++)
	{
		for(int j=i+1;j<l;)
		{
			k=(int) Math.pow(s1.charAt(i), s1.charAt(j));
			sum = sum + k;
		
	//	System.out.println(s1.charAt(0));
		}
	
	}
	
	System.out.println(sum);
	
	}

}
