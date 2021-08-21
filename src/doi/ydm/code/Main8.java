package doi.ydm.code;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Main8
 * @Description TODO
 * @Author YDM
 * @Date 2021/8/21 13:57
 **/
/*
* 二叉树的输入
*
* */
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        List<Integer>[] arrs = new List[m+1];
        for (int i = 0; i <=m; i++) {
            arrs[i] = new ArrayList<>();

        }
        while (scanner.hasNext()){
            String str = scanner.nextLine(); //包含空格 next（）不包含
            String[] strs = str.trim().split(" "); //前中后空格都要处理
            if(strs.length==3){
                int left =Integer.parseInt(strs[0]);
                int right=Integer.parseInt(strs[2]);
                arrs[left].add(right);
            }
        }
        int count = 0;
        for (int i = 0; i <= m; i++) {
            if (arrs[i].size()==2){
                if (arrs[args[i].get(0)].size() == 0 && args[args[i].get(1)].size() ==0 ){
                    count ++;
                }
            }

        }

        System.out.println(count);

        scanner.close();

    }
}
