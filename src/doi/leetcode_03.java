package doi;

/**
 * @ClassName leetcode_03
 * @Description TODO
 * @Author YDM
 * @Date 2021/7/23 10:04
 **/
class leetcode_03 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] a = new int[51];
        for(int i = 0; i < ranges.length; i++)
            for(int j = ranges[i][0]; j <= ranges[i][1]; j++)
                a[j] = 1;
        for(int i = left; i <= right; i++)
            if(a[i] != 1)
                return false;
        return true;
    }
}



