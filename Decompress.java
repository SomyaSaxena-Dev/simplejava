import java.util.ArrayList;
import java.util.List;

class Decompress {
	public static void main(String args[]) {
		int a[]= {1,2,3,4};
		int b[] =decompressRLElist(a);
		for(int x :b){
		System.out.print(x);
		}
	}
    public static int[] decompressRLElist(int[] nums) {
        int j = 0;
        int k =0;
        int l =0;
      
       List<Integer> outarr = new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
        	if(i != nums.length -1)
        		j = i+1;
            while(l++<nums[i]) {
                 outarr.add(nums[j]);
        }l=0;
           
    }
        int[] arr = new int[outarr.size()];
        for (int i =0; i < outarr.size(); i++) 
            arr[i] = outarr.get(i); 
  
        return arr;
}
}