import java.util.Arrays;

class Solution {
	 static int[] target = new int[6];
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       
        int i=0;
        for(;i<m;i++){
            target[i]= nums1[i];
        }
        for(int j =0;j<n;j++){
            target[i++]= nums2[j];
            
        }
        
        Arrays.sort(target);
      
    }
    public static void main(String[] args) {
    	int nums[]= {1,2,3,0,0,0};
    	int nums2[] = {2,5,6};
    	merge(nums,3,nums2,3);
    	System.out.println("Target");
    	for(int i : target) {
    		System.out.println(i+ " ");
    	}
    	
	}
}