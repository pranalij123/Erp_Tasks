package MultiThreading;

public class SleepEx {

	public static void main(String[] args) {
		String str="Prachi";
		for(int i=0;i<5;i++) {
		try {
			Thread.sleep(1000);
			System.out.println(str.charAt(i));
		}
		catch(InterruptedException e){
			System.out.println(" InterruptedException handled");
		}
		}
	}

}
