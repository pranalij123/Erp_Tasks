package MultiThreading;

public class IllegalThreadStateException {

	public static void main(String[] args) {
		Thread1 th=new Thread1();
		th.start();
		th.start();
	}

}
class Thread1 extends Thread{
	
	@Override
	public void run(){
		System.out.println("hii");
	}
}