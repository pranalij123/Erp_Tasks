package MultiThreading;

public class UsingRunnableInterface {

	public static void main(String[] args) {
		
		MyThread3 m= new MyThread3();
		Thread t=new Thread(m);
		t.start();
	}

}
class MyThread3 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	
}
