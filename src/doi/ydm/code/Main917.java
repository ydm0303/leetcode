package doi.ydm.code;

import java.util.HashSet;

/**
 * @ClassName Main917
 * @Description TODO
 * @Author YDM
 * @Date 2021/9/17 11:11
 **/
public class Main917 {
    public int lengthOfLongestSubstring (String s) {
    // write code here
    int r=0,l=0,res=0;
        HashSet<Character> set= new HashSet<>();
        while (r<s.length()){
            char c=s.charAt(r++);
            while (set.contains(c)){
                set.remove(s.charAt(l++));
            }
            set.add(c);
            res=Math.max(res,set.size());
        }


    return res;
    }
}
