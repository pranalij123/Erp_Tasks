package MultiThreading;
//Thread Shedular is Part Of Jvm which decides which thread will execute first
public class ThreadShedular {

	public static void main(String[] args) {
		int a=23;
		int b=6;
		Addition add= new Addition(a,b);
		add.start();
		Substraction sub= new Substraction(a,b);
		sub.start();
		Multiplication mul= new Multiplication(a,b);
		mul.start();
		
		
	}
	
	

}

class Addition extends Thread{
	int a;
	int b;
	Addition(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	@Override
	public void run() {
		System.out.println("Add :"+(a+b));
	}
	
}

class Multiplication extends Thread{
	int a;
	int b;
	Multiplication(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	@Override
	public void run() {
		System.out.println("Multi :"+a*b);
	}
	
}

class Substraction extends Thread{
	int a;
	int b;
	Substraction(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	@Override
	public void run() {
		System.out.println("Sub:"+(a-b));
	}
	
	
}
