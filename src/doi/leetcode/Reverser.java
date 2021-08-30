package doi.leetcode;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * @ClassName Reverser
 * @Description TODO
 * @Author YDM
 * @Date 2021/7/23 10:38
 **/

//������ת
public class Reverser {
    public int reverse(int x){
        long ans = 0;
        while (x != 0){
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
    return (int) ans == ans ? (int)ans : 0;
    }
}

