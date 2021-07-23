package java;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * @ClassName Reverser
 * @Description TODO
 * @Author YDM
 * @Date 2021/7/23 10:38
 **/

//整数反转
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

//溢出问题
/*
因为不能用long，用String处理过界问题也很麻烦，所以就只能乖乖用int了。
当res > 0时，若 res * 10 + x % 10 > Integer.MAX_VALUE，等价于res > (Integer.MAX_VALUE - x % 10) / 10，若成立，则超出范围（注意，这里x是正数）
当res < 0时，若 res * 10 + x % 10 < Integer.MIN_VALUE，等价于res < (Integer.MIN_VALUE - x % 10) / 10，若成立，则超出范围（注意，这里x是负数）

。
* */
class Solution{
    public int reverse(int x){
        int res = 0;
        while (x != 0){
            if(res >0 && res > (Integer.MAX_VALUE - x % 10) / 10){
                return 0;
            }
            if(res < 0 && res < (Integer.MIN_VALUE - x % 10) / 10){
                return 0;
            }
            res = res *10 + x % 10;
            x = x / 10;

        }
        return res;
    }
}
