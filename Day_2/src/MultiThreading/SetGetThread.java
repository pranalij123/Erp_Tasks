package MultiThreading;

public class SetGetThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Pranali");
		System.out.println(Thread.currentThread().getName());

	}

}
