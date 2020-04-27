import java.util.Arrays;

public class EvenNumberDigit {

	public int missingNumber(int[] nums) {
        int x = nums.length;
        int newarr[] = new int[x];
        for(int i =0; i<x;i++){
            newarr[i]=i;
        }
        Arrays.sort(nums);
        for(int i=0;i <= nums.length ;i++){
            if(nums[i]!=newarr[i] ){
                return i;
              
            }
            if(nums[j] !=newarr[j])
            return j;
        }
    }
}
