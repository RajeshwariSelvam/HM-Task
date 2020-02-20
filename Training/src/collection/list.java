package collection;
import java.util.Iterator;
import java.util.Vector;
public class list {

	public static void main(String[] args) {
		  
		Vector<String> v=new Vector<String>();  
		v.add(0,"12");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr=v.iterator(); 
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
	}
	
	
