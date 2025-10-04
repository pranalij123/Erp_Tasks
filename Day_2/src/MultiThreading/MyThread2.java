package MultiThreading;

public class MyThread2 {

	public static void main(String[] args) {
		Mythrd th=new Mythrd();
		th.start();
		try{
			th.join();
		}catch(InterruptedException e){
			System.out.println(e);
		}
		Thread th1=Thread.currentThread();
		String name=th1.getName();
		for (int i=0;i<5 ;i++ ) {
			System.out.println(i+" "+name);
			
		}

		}

}
class Mythrd extends Thread{
	public void run(){
	Thread th=Thread.currentThread();
	String name=th.getName();
		for(int i=0;i<5;i++){
			System.out.println(i+" "+name);
		
		}
	}
}
