package MultiThreading;

public class JoinExample {

	public static void main(String[] args) {
		InnerThread th= new InnerThread();
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("main :"+i);
		}

	}

}

class InnerThread extends Thread{
	@Override
	public void run() {
		try {
			
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted Exception handled");
		}
		for(int i=10;i<=100;i+=10) {
			System.out.println("InnerThread :"+i);
		}
		
	}
}
