package doi.ydm.code;

import javax.swing.*;
import java.security.PublicKey;

/**
 * @ClassName Mian10
 * @Description TODO
 * @Author YDM
 * @Date 2021/8/23 15:49
 **/
public class Mian10 {

    public int[] getFraction (float a) {
        // write code here
        int[] ints = new int[2];
        String s =String.valueOf(a);
        long length = s.length();
        int fenzi = (int)(a*Math.pow(10,length));
        int fenmu = (int)(1*Math.pow(10,length)-1);
        ints[0] = fenzi / getMax(fenzi,fenmu);
        ints[1] = fenmu / getMax(fenzi,fenmu);;
        return ints;

    }
    static int getMax(int m, int n){
        if(n%m==0){
            return m;
        }else {
            return getMax((n%m),n);
        }

    }
}
