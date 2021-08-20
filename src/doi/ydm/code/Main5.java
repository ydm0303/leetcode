package doi.ydm.code;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName Main5
 * @Description TODO
 * @Author YDM
 * @Date 2021/8/20 19:02
 **/
public class Main5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //有序可重复 List
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0;i<2 *n;i++){
            list.add(sc.nextInt());
        }
        int result = 0;
        int i =0;
        while(i<list.size()-3){
            //IndexOf()  第一次出现索引的地方
            //lastIndexOf()  最后一次出现索引的位置
            int secondIndex = list.lastIndexOf(list.get(i));
            result += secondIndex-i-1;
            list.remove(secondIndex);
            i++;
        }
        System.out.println(result);
    }
}
