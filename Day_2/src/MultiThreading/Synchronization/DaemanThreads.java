	package MultiThreading.Synchronization;

public class DaemanThreads {

	public static void main(String[] args) {
		MyThr t1= new MyThr();
		t1.setDaemon(true);
		t1.start();
		Thread m= Thread.currentThread();
		
		System.out.println(m.getName()+" - "+m.isDaemon());
	}

}
class MyThr extends Thread{
	@Override
	public void run() {
		Thread.currentThread().setName("Pooja");
		 System.out.println(Thread.currentThread().getName() + " - " + Thread.currentThread().isDaemon());
	}
}