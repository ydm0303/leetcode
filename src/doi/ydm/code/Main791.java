package doi.ydm.code;

import java.util.Arrays;

/**
 * @ClassName Main791
 * @Description TODO
 * @Author YDM
 * @Date 2021/9/17 15:58
 **/
public class Main791 {
    public int[] leftRotate (int[] nums, int k) {
        // write code here
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[i-k%n]=nums[i];
        }
    }
}
