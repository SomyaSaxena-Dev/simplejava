
public class AbstractInnerClassImpl {

	public static void main(String args[]) {
		InnerClassAbstract obj = new InnerClassAbstract() {
			public void sum(int a, int b) {
				System.out.println(a+b);
			}
		};
		obj.sum(5, 4);
	}
}
