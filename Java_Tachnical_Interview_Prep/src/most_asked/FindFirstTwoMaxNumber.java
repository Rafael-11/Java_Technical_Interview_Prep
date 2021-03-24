package most_asked;

import java.util.Arrays;

public class FindFirstTwoMaxNumber {
    public static void main(String[] args) {
		//[4,7,8,2,0,1]==>7,8
    	int[] arr= {4,7,8,2,0,1};
    	getTwoMax(arr);
    	
    	
	}
    public static void getTwoMax(int[] nums) {
      int fNum=0,sNum=0;
       Arrays.sort(nums);
       
       fNum=nums[nums.length-1];
       sNum=nums[nums.length-2];
       
       System.out.println("Fist Max number is: "+fNum);
       System.out.println("Second Max number is: "+sNum);
       
    }
}
