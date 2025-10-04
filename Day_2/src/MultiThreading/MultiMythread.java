package MultiThreading;

public class MultiMythread extends Thread{

	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		MultiMythread th1=new MultiMythread();
		MultiMythread th2=new MultiMythread();
		th1.start();
		th2.start();
	}

}
