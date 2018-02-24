package leetcode;

import java.util.Arrays;

/**
 * 两数之和
 * @author ChaiYuming
 *
 */
public class TwoSum {  
    public static int[] twoSum(int[] nums, int target) {
    	int[] result = new int[2];
    	int num1 = 0;
    	int num2 = 0;
    	String flag = "0";
    	for(int i=0;i<nums.length;i++) {
    		num1 = nums[i];
    		for(int j=0;j<nums.length;j++) {
    			if(i!=j && nums[i]+nums[j]==target) {
    				result[1] = j;
    				flag = "1";
    				break;
    			}
    		}
    		result[0] = i;
    		if("1".equals(flag)) {
    			break;
    		}
    	}
    	return result;
    }
    
    
    public static void main(String[] args) {
    	int[] nums = {3,2,4};
    	int target = 6;
//    	int[] nums = {2, 7, 11, 15};
//    	int target = 9;
        int[] result = new int[2];
        result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
