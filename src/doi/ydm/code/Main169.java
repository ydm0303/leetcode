package doi.ydm.code;


/**
 * @ClassName Main169
 * @Description TODO
 * @Author YDM
 * @Date 2021/9/16 19:17
 **/
public class Main169 {
    public String maxLexicographical (String num) {
        // write code here
        /*
        * "1010"
        * "0000"
        * "0110"
        * ""
        * */
        char[] chars = num.toCharArray();
        int len = num.length();
        for (int i = 0; i < num.length(); i++) {
            if(num.equals('0')){
                chars[i]=num.charAt('1');
                break;

            }

        }
    return chars.toString();
    }
}
