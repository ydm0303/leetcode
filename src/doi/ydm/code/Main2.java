package doi.ydm.code;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @ClassName Main2
 * @Description TODO
 * @Author YDM
 * @Date 2021/8/20 17:01
 **/
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> str = new HashSet<>();
        while(sc.hasNext()){
            str.add(sc.next());
        }
        int num = str.size();
        System.out.println(num);
        sc.close();


    }
}
//4 2 3 4