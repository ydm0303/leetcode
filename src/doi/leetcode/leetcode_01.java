package doi.leetcode;

import java.util.concurrent.ForkJoinPool;

/**
 * @ClassName leetcode_01
 * @Description TODO
 * @Author YDM
 * @Date 2021/7/22 16:25
 **/
public class leetcode_01 {
    class Solution{
        public int[] twoSum(int[] nums,int target){
            int[] result = new int[] {0,1};
            if(nums.length == 2){
                return result;
            }
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1 ; j < nums.length; j++) {
                    if(nums[i] + nums[j] ==target){
                        result[0] = i;
                        result[1] = j;
                        return result;

                    }
                }

            }

            return result;
        }
    }

}
