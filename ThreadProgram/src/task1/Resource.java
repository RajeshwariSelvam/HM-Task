package task1;

public class Resource {
static int count =0;

static synchronized void increment() {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	count++;
}
}
