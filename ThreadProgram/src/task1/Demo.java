package task1;

class A extends Thread{
	static int a=10;
	static int b=4;
	static int c=0;
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c =a + b;
	}
}
public class Demo {
	public static void main(String[] args) {
		System.out.println("welcome");
		A a = new A();
		a.start();
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(A.c);
	}

}
