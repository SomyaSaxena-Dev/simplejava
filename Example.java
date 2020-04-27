public class Example {

	 public void display(String s) {
		 System.out.print("Amdocs");
	 }	 
	 public void display(NullPointerException ne) {
			System.out.println("NullPointerException");
		}
	 public static void main() {
		 Example e = new Example();
		 e.display(null);
	 }
}