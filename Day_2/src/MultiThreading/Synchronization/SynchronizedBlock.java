package MultiThreading.Synchronization;

public class SynchronizedBlock {
	static Demo1 d;

	public static void main(String[] args) {
		d = new Demo1();
		MyThread4 t1 = new MyThread4(d);
		t1.setName("Smita");
		t1.start();
		MyThread4 t2 = new MyThread4(d);
		t2.setName("Prjwal");
		t2.start();
	}

}

class MyThread4 extends Thread {
	Demo1 d;

	MyThread4(Demo1 d) {
		this.d = d;
	}

	public void run() {
		synchronized (d) {
			d.myMethod();
		}

	}
}

class Demo1 {
	public void myMethod() {
		System.out.println(1);
		System.out.println(100);
		synchronized (this) {
			System.out.println(1000);
		}
		System.out.println(101);
	}
}