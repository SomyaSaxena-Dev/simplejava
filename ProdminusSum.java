
public class ProdminusSum {
	public static void main(String args[]) {
		System.out.println(subtractProductAndSum(234));
	}

	 public static int subtractProductAndSum(int n) {
	        int prod=1,sum=0;
	        int div;
	        while(n>0){
	            div=n%10;
	            n=n/10;
	            prod*=div;
	            sum+=div;
	        }
	        System.out.println(prod);
	        System.out.println(sum);
	        return prod-sum;
	    }
}
