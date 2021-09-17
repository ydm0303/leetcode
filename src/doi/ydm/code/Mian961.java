package doi.ydm.code;

import sun.security.util.Length;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * @ClassName Mian961
 * @Description TODO
 * @Author YDM
 * @Date 2021/9/16 15:22
 **/
public class Mian961 {
    public double findMedianSortedArrays (int[] nums1, int[] nums2) {
        // write code here
        int len1 = nums1.length;
        int len2 = nums2.length;
        int sumlen=len1+len2;
        int middle = sumlen /2;
        Arrays.copyOf(nums1,sumlen,nums2,sumlen, ints);
        int[] ints = new int[sumlen];
        Arrays.copyOf(nums1,0,)
        Arrays.sort(ints);
        if(sumlen%2==0){
            return ints[middle]+ints[middle-1]/2.0;
        }


        return ints[middle]/1.0;
    }
}
