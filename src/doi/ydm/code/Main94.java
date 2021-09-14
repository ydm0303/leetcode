package doi.ydm.code;

import java.util.Scanner;

/**
 * @ClassName Main94
 * @Description TODO
 * 每个人会被问到多个关于另一个同学相关的问题，答对加一分，打错负一分，
 * 在所有问答环节结束之后，HR统计在这些同学中，哪个子矩阵区域的同学总分最高，
 * 并对这个区域的同学进行鼓励。
 *
 * 输入第一行为整数N，第二行为N*N个整数组成(空格分割)，
 * 代表同学的答题得分的矩阵（行优先，第一行N个数，接着第二行N个数，以此类推）。
 *
 * 队伍中一个得分最高的子队伍得分
 * 3
 * 1 2 -3 3 4 -5 -5 -6 -7
 *
 * @Author YDM
 * @Date 2021/9/4 11:13
 **/
public class Main94 {
    public static void main(String[] args) {
        int max=0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n * n; i++) {
            int a=scanner.nextInt();
            if(a>0){
                max+=a;
            }
        }
        System.out.println(max);
        scanner.close();
    }

}


