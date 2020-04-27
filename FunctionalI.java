public class FunctionalI {

	public static void main(String args[]) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Creating a thread");
			}
			
		}).start();
	}
}
