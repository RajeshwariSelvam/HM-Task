package task1;
class Thread1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			Resource.increment();
		System.out.println("Thread 1:"+Resource.count);
		}
	}	
}
class Thread2 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			Resource.increment();
			System.out.println("Thread 2 :"+Resource.count);
		}
	}	
}
public class InterThread {
	public static void main(String[] args) {
	Thread1 t1 = new Thread1();
	t1.start();
	Thread2 t2 = new Thread2();
	t2.start();
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(Resource.count);
	}
}
