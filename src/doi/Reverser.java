package doi;

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

//�������
/*
��Ϊ������long����String�����������Ҳ���鷳�����Ծ�ֻ�ܹԹ���int�ˡ�
��res > 0ʱ���� res * 10 + x % 10 > Integer.MAX_VALUE���ȼ���res > (Integer.MAX_VALUE - x % 10) / 10�����������򳬳���Χ��ע�⣬����x��������
��res < 0ʱ���� res * 10 + x % 10 < Integer.MIN_VALUE���ȼ���res < (Integer.MIN_VALUE - x % 10) / 10�����������򳬳���Χ��ע�⣬����x�Ǹ�����

��
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
