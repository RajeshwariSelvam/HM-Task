package interfac;

public class CarStructure implements Honda {
  

	public void engine() {
		System.out.println("Honda Engine");
	}


	public void motor() {

		System.out.println("honda motor");
	}

	public void Tyre() {

		
		System.out.println("TYRE");

	}

	public int brake(String s) {
		System.out.println(s);
		return 0;
	}

	public String brake(int i) {
		System.out.println(i);

		return "Hydraulic Brake";

	}

	
	  public void Hondacity() { 
		  
		  System.out.println("Diesel Engine");
	  
	  }
	 

	public  void HondaAccord() {
		
		System.out.println("Petrol Engine");
		Honda.super.p();

	}

	public static void main(String[] args) {
	
		CarStructure cs = new CarStructure();
		System.out.println(cs.brake(1));
		cs.brake("ABS");
		cs.engine();
		cs.HondaAccord();
		cs.motor();
		cs.Hondacity();
		System.out.println(cs.b);
		Car.s();
		System.exit(0);
		
    
	}



	


}
