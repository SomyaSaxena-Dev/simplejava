class BalancedString {
    public static int balancedStringSplit(String s) {
     char[] arr = s.toCharArray();
        int ans=0;
        int b=0;
        for(char a:arr){
            if(a =='L'){
            	System.out.println("Character is L");
                b++;
            }
            else{
            	System.out.println("Character is R");
                    b--;
            }
            if(b==0) {
            	ans+=1;
            }
        }
        return ans;
 
    }
    public static void main(String[] args) {
		String a="RLRRLLRLRL";
		String b="RLLLLRRRLR";
		System.out.println("Value for a is "+ balancedStringSplit(a));
		System.out.println("Value for b is "+ balancedStringSplit(b));
	}
}