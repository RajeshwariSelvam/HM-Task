package abstrac;

public abstract class Cat extends Animal {

    abstract int sound(String s);
	protected void sound()
	{
		System.out.println("Cat");
	}
	
    
	abstract String so(String s);

}
