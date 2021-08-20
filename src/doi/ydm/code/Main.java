package doi.ydm.code;

import java.util.Scanner;

/**
 * @ClassName Main
 * @Description TODO
 * @Author YDM
 * @Date 2021/8/20 15:46
 **/
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int init = sc.nextInt();
            int[] mon = new int [n];
            for(int i=0;i<n;i++){
                mon[i]=sc.nextInt();
                if(init>mon[i]){
                    init+=mon[i];
                }
                else{
                    init+=getGYS(init,mon[i]);
                }
            }
            System.out.println(""+init);

        }
        sc.close();


    }
    //获取对应的最大公约数
    public static int getGYS(int n, int m){
        if(m%n==0){
            return n;
        }else{
            return getGYS(m%n,n);
        }

    }




}
