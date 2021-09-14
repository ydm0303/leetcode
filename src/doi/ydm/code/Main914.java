package doi.ydm.code;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    /* Write Code Here */
    public int solution(int[] arr) {
        int result=0;
        int[] list = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int j=1;
            list[j]+=arr[i]*j;
            j++;
        }


        return 13;
    }
}

public class Main914 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine().trim());
            _arr[_arr_i] = _arr_item;
        }

        res = new Solution().solution(_arr);
        System.out.println(String.valueOf(res));

    }
}
