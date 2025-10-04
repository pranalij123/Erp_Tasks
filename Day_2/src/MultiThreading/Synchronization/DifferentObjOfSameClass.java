package MultiThreading.Synchronization;

public class DifferentObjOfSameClass {

	public static void main(String[] args) {
		Greeting1 g= new Greeting1();
		Greeting1 g1= new Greeting1();
		InnerThread1 t1=new InnerThread1(g,"Ram");
		InnerThread1 t2=new InnerThread1(g1,"Raj");
		t1.start();
		t2.start();
		
	}

}

class InnerThread1 extends Thread{
	 
	 Greeting1 g;
	 String name;
	 
	 public InnerThread1(Greeting1 g, String name) {
		this.g=g;
		this.name=name;
	}
	 
	 @Override
	public void run() {
		g.greet(name);
		g.print(name);
	}
}


class Greeting1{
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
