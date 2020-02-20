package abstrac;

public class puppy extends Dog {

	@Override
	String so(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		return null;
	}

	@Override
	String sound(int a) {
		// TODO Auto-generated method stub
		System.out.println("Sound of puppy is wow wow");
		System.out.println("a value is "+ super.a);
		return "P";
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
puppy p = new puppy();
//p.sound("Dog Sound");
p.a=90;
p.so("So Pu");
System.out.println(p.sound(10));

p.sound();

System.out.println(p.a);
	}

	

//	@Override
//	void sound() {
//		// TODO Auto-generated method stub
//		System.out.println("puppy");
//	}

	
	

}
