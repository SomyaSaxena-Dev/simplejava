
public class LambdaEx {

	public static void main(String args[]) {
		
		BubbleSort obj = (int A[]) ->{
			
			for(int i = 0; i <A.length; i++) {
				for (int j=i+1; j<A.length;j++) {
					if(A[i] > A[j]) {
						int temp = A[i];
						A[i] = A[j];
						A[j] = temp;
					}
				}
			}
			
		};
		int B []= {5,4,52,2,1};
		obj.sort(B);
		System.out.println("After sort");
		for(int i : B){
			System.out.println(i);
		}
		
	}
}

