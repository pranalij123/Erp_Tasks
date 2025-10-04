package MultiThreading;

public class YieldExample {

	public static void main(String[] args) {
		MyThread4 m= new MyThread4();
		m.start();
		Thread.yield();
		for(int i=0;i<5;i++) {
			System.out.println("main : "+i);
		}

	}

}
class MyThread4 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("MyThread4 : "+i);
		}
	}
}
