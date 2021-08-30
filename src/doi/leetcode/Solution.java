package doi.leetcode;


import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author YDM
 * @Date 2021/8/30 21:07
 **/
public class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] newArr=new int[n];
        for (int i = 0; i < n; i++) {
            newArr[(i+k)%n]=nums[i];
        }
        System.arraycopy(newArr,0,nums,0,n);

        for (int i = 0; i < n; i++) {
            nums[i]=newArr[i];
        }


    }
}
