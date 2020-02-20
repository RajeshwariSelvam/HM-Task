package interfac;

public abstract interface Honda extends Car {

	abstract void Hondacity();
	void HondaAccord();
	static int b =90 ;
	 public default  void p()
	{
		 
		System.out.println("p");
		Car.s();
	}
	public static void main(String args[])
	{
		//Honda h new Honda();
	
		System.out.println("Hi");
	}
	
	
}
