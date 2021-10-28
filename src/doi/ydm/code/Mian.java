package doi.ydm.code;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

/**
 * @ClassName Mian
 * @Description TODO
 * @Author YDM
 * @Date 2021/10/13 21:09
 **/
public class Mian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 1;
        for (int i = 0; i < n; i++) {
            int k= sc.nextInt();


            for (int j = 0; j < k; j++) {
                int[] a=new int[k];
                a[i]=sc.nextInt();
                if(findMaxIndex(a)!=0||findMaxIndex(a)!=n-1){
                    flag=1;
                }else{
                    flag=0;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            if(flag==0){
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
    }

    private static int findMaxIndex(int[] a) {
        int n = a.length;
        int max = 0;
        int index=0;
        for (int i = 0; i < n; i++) {
            if(a[i]>max){
                max=a[i];
                index=i;
            }
        }
        return index;
    }
}
