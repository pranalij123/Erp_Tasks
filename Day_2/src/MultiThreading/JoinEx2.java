package MultiThreading;

public class JoinEx2 {

	public static void main(String[] args) throws InterruptedException {
	 Childthr t1=new Childthr();
	 t1.start();
	 t1.join();
	 t1.join(1000);
	 t1.join(1000,500);
	 for(int i=1;i<=10;i++) {
		 System.out.println("main :"+i);
	 }

	}

}

class Childthr extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("ChildThr :"+i);
		}
	}
}