package doi.ydm.code;

/**
 * @ClassName Main929
 * @Description TODO
 * @Author YDM
 * @Date 2021/9/29 20:05
 **/
public class Main929 {
    public String longestPrefix (String s) {
        // write code here
        String pre = "";
        String suf = "";
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            pre=s.substring(0,n-i-1);
            suf=s.substring(i+1,n);
            if(pre.equals(suf)){
                return pre;
            }
        }
        return "";
    }

}
