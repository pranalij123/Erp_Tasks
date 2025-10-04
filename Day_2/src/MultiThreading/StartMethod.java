package MultiThreading;

public class StartMethod {

	public static void main(String[] args) {
		NewThread m= new NewThread();
		m.start();
		
		
		
	}

}

class NewThread extends Thread{
	@Override
	public void start() {
		System.out.println("start() started");
		run();
		System.out.println("start() finished");
	}
	@Override
	public void run() {
		System.out.println("Run executed");
	}
		
}