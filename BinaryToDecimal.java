public class BinaryToDecimal {

	public static void main(String[] args) {
		String binary="100100111000000";
		int decval=0;
		int base =1;
		for(int i=binary.length()-1;i>=0;i--) {
			if(binary.charAt(i)=='1') {
				decval+=base;	
			}
			base*=2;
		}
		System.out.println("Dec Val is : "+decval);
	}
}

