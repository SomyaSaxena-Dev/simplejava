
public class InnerClassInterfaceImpl {

	public static void main(String args[]) {
		InnerClassInterface obj = new InnerClassInterface() {
			public void sum(int a, int b) {
				System.out.println("Mai sum nahi nikal kar dungi, khud karlo");
			}
		};
		obj.sum(5, 4);
		
		//With lambda
		InnerClassInterface obj2 = (a,b) -> {
			System.out.println(a+b);
		};
		obj2.sum(5, 4);
	}
}
