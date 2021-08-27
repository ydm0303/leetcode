package doi.ydm.code;


import java.util.Scanner;

/**
 * @ClassName Main9
 * @Description TODO
 * @Author YDM
 * @Date 2021/8/21 15:09
 **/
public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s= scanner.next();
            String[] ss = s.split(" ");
            int[] arr = new int[ss.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(ss[i]);
            }

        }






    }
}
