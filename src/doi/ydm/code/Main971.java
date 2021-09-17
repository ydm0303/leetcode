package doi.ydm.code;


/**
 * @ClassName Main971
 * @Description TODO
 * @Author YDM
 * @Date 2021/9/17 11:16
 **/
public class Main971 {
    public boolean isValid (String s) {
        // write code here
        char[] chars = s.toCharArray();
        char[] chars1= new char[chars.length];
        int count=0;
        for (int i = 0; i < chars.length; i++) {
            chars1[count] = chars[i];
            //编码
            if(count!=0&&(chars[count]-chars1[count-1]==2||chars[count]-chars1[count-1]==1)){
                count--;
            }else {
                count++;
            }
        }
        return count==0;
    }
}
