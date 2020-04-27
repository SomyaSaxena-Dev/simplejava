public class CheckWrapper {
//Primitive Wrapper Classes are immutable in JAVA
// So the value of yWrap will not change
	public static void multiply(int x) {
		System.out.println("Inside Normal Function");
		x = x*2;
		System.out.println(x);
	}
	
	public static void multiply(Integer x) {
		System.out.println("Inside Wrapper Function");
		x = x*2;
		System.out.println(x);
	}
	
	public static void main(String args[]) {
		
		int y = 2;
		Integer yWrap = 3;
		multiply(y);
		System.out.println(y);
		multiply(yWrap);
		
		System.out.println(yWrap);
	}
}
