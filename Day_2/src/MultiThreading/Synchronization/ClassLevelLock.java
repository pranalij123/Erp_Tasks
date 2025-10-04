package MultiThreading.Synchronization;

import MultiThreading.Mythread;

public class ClassLevelLock {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		t1.start();
		MyThread2 t2=new MyThread2();
		t2.start();
		MyThread3 t3=new MyThread3();
		t3.start();

	}

}
class MyThread extends Thread{
	
	static Demo d=new Demo();
	public void run() {
		Thread.currentThread().setName("Pranali");
		d.m2();
		Demo.m1();
		
	}
}

class MyThread2 extends Thread{
	
	static Demo d=new Demo();
	public void run() {
		Thread.currentThread().setName("Pranali");
		MyThread.d.m3();
		MyThread.d.m2();
		Demo.m1();
		
	}
}

class MyThread3 extends Thread{
	
	static Demo d=new Demo();
	public void run() {
		Thread.currentThread().setName("Pranali");
		
		MyThread.d.m2();
	
	}
}
class Demo{
	public synchronized static void m1() {
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i+"m1()");
		}
	}
	synchronized void m2() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+"m2()");
		}
	}
	void m3() {
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i+"m3()");
		}
	}
}


