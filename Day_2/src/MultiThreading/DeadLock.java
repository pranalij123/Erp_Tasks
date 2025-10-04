package MultiThreading;

public class DeadLock {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().join();
		System.out.println("hii");
	}

}
