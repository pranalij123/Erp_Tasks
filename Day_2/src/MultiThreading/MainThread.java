package MultiThreading;

public class MainThread {
	
	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.start();
		System.out.println("main thread started");
	}

}
