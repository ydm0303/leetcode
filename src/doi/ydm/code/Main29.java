package doi.ydm.code;

import java.util.Scanner;

/**
 * @ClassName Main29
 * @Description
 * 第一行三个正整数n，p，q（1<=n<=200,0<=p<=100,0<=q<=100,p+q=100）
 * 第二行n个正整数表示n个学生的期末考试分数（0<=分数<=100）
 *
 *
 *
 * @Author YDM
 * @Date 2021/8/29 16:04
 **/
public class Main29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  //人数n
        int p = scanner.nextInt();  //平时成绩占比 p
        int q = scanner.nextInt();  //期末成绩占比  q
        int sum = 0;
        /*
        * a为平时分
        * b为期末成绩
        * */
        for (int i = 0; i < n; i++) {
            int nextInt = scanner.nextInt();
            if((p*100+q*nextInt)/100>=60.0)
                sum++;
        }
        System.out.println(sum);
    }
}
