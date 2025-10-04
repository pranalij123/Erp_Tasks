package MultiThreading;

public class Mythread extends Thread{
	@Override
	public void run(){
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		Mythread th=new Mythread();
		th.start();
	}

}
