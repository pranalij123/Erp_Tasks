package MultiThreading;

public class InterruptedThreadEx2 {

	public static void main(String[] args) {
		String str="Pranali";
		for(int i=0;i<str.length();i++) {
			try {
				Thread.sleep(2000);
				if(i==3) {
					Thread.currentThread().interrupt();
				}
				System.out.println(str.charAt(i));
			}
			catch(InterruptedException e) {
				System.out.println(" I got InterruptedException");
			}
		}

	}

}
