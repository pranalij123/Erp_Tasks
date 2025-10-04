package MultiThreading;

public class RunMethod {

	public static void main(String[] args) {
	Thread2 m=new Thread2();
	m.start();
	m.run();
	System.out.println(Thread.currentThread().getName());

	}

}

class Thread2 extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}