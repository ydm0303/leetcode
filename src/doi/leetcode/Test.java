package doi.leetcode;

/**
 * @ClassName Test
 * @Description TODO
 * @Author YDM
 * @Date 2021/7/22 17:23
 **/
public class Test {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);

    }


    static void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
    }
}
