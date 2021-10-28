package doi.ydm.code;

/**
 * @ClassName Main1410
 * @Description TODO
 * @Author YDM
 * @Date 2021/10/14 20:50
 **/
public class Main1410 {
    public String get_substr (String st) {
        // write code here
        int n = st.length();
        if(n==0)
            return st;
        for (int i = 0; i < n; i++) {
            if(st.charAt(i)==st.charAt(i+1)&&st.charAt(i+1)==st.charAt(i+1)){
                n-=3;

            }
        }
//        return st;
        return st;
    }
}
