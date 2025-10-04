package MultiThreading.Synchronization;

public class InterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		MyThread5 t1= new MyThread5();
		t1.start();
		t1.setName("Jadhav");
		synchronized (t1){
			t1.wait();
			System.out.println(t1.sum);
		}
	}

}
 class MyThread5 extends Thread{
	 int sum=0;
	 public void run() {
		 synchronized(this){
				for(int i=1;i<=500;i++) {
					sum+=i;
				}
				this.notify();
			}
	 }
 } 
