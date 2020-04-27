public class SimpleThread{
	
	public static void main(String args[]) {
		Thread t = new Thread(new AB());
		t.start();
	}
	
	
}
