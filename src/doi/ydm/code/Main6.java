package doi.ydm.code;

import java.util.Scanner;

/**
 * @ClassName Main6
 * @Description TODO
 * @Author YDM
 * @Date 2021/8/20 19:56
 **/
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            m[i]=sc.nextInt();
            result+=m[i];

        }
       if (result % 5==0){
       }

        sc.close();


    }
}
