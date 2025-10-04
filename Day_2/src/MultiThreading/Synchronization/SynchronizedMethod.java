package MultiThreading.Synchronization;

public class SynchronizedMethod {

	public static void main(String[] args) {
		Greeting g= new Greeting();
		InnerThread t1=new InnerThread(g,"Ram");
		InnerThread t2=new InnerThread(g,"Raj");
		t1.start();
		t2.start();
		
	}

}

 class InnerThread extends Thread{
	 
	 Greeting g;
	 String name;
	 
	 public InnerThread(Greeting g, String name) {
		this.g=g;
		this.name=name;
	}
	 
	 @Override
	public void run() {
		g.greet(name);
		g.print(name);
	}
 }

 
 class Greeting{
	 public synchronized void  greet(String name) {
		 for(int i=1;i<=10;i++) {
			 try {
				 System.out.println("Hello "+name);
				 Thread.sleep(1000);
			 }
			 catch(InterruptedException e) {
				 System.out.println("InterruptedException handled ");
			 }
		 }
	 }
	 
	 public void print(String name) {
		 for(int i=0;i<10;i++) {
			 System.out.println(name +" "+i);
		 }
	 }
 }