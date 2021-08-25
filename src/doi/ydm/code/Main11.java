package doi.ydm.code;

import java.util.EmptyStackException;

/**
 * @ClassName Main11
 * @Description TODO
 * @Author YDM
 * @Date 2021/8/25 21:26
 **/
public class Main11 {
    public String solve (String IP) {
        // write code here
        //排除空格输入
        if(IP.trim().equals(""))
            return "Neither";
        //排除： .
        if(IP.substring(IP.length()-1,IP.length()).equals(":")||IP.substring(IP.length()-1,IP.length()).equals("."))
            return "Neither";
        String[] strings = IP.split("\\.");
        String[] stringsIPv6 = IP.split("\\.");
        if(strings.length==4 && stringsIPv6.length!=8){
            for (String s : strings) {
                if(s.length()>3) return "Neither";
                if(s.length()==0) return "Neither";
                char[] chars = s.toCharArray();
                if(chars.length>1 && chars[0] == '0') return "Neither";
                for (char c : chars) {
                    if(c - '0' < 0 || '9' - c < 0) return "Neither";
                }
                int change = Integer.parseInt(s);
                if(change < 0 || change >255) return "Neither";
            }
            return "IPv4";
            }
        else if(strings.length !=4 && stringsIPv6.length==8){
            int j =1;
            for (int i = 0; i < stringsIPv6.length; i++) {
               if(stringsIPv6[i].length() >4 ) return "Neither";
               if(stringsIPv6[i].length()==0) return "Neither";
               char[] chars = stringsIPv6[i].toCharArray();
                for (int k = 0; k < chars.length; k++) {
                    if((chars[k]-'0'>=0 &&'9'-chars[k]>=0)||(chars[k]>='a' &&chars[k]<='f')||
                            (chars[k] >= 'A'&&chars[k]<='F')){
                        continue;

                    }else{
                        return "Neither";
                    }

                }
            }



        }
        return "IPv6";
    }
}
