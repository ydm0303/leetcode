package java;

/**
 * @ClassName leetcode_04
 * @Description TODO
 * @Author YDM
 * @Date 2021/7/24 23:39
 **/
public class leetcode_04 {
    public String maximunTime(String time){
        /*
        * hh:mm
        * 第一位：如果需要被替换，优先替换为 2，当然前提是第二位不能超过 4。否则会出现 24:xx、25:xx 等；
          第二位：如果需要被替换，根据第一位是什么，决定替换为 9 还是 3；
          第三位：固定为 :；
          第四位：如果需要被替换，替换为 5；
          第五位：如果需要被替换，替换为 9。

        * */
        StringBuffer sb = new StringBuffer();
        sb.append(time.charAt(0) =='?' ? (time.charAt(1) == '?' || time.charAt(1) < 4) ? "2" : "1" : time.charAt(0));
        sb.append(time.charAt(1) =='?' ? sb.charAt(0) == '2' ? '3' : '9' : time.charAt(1));
        sb.append(':');
        sb.append(time.charAt(3) == '?' ? '5' : time.charAt(3));
        sb.append(time.charAt(4) == '?' ? '9' : time.charAt(3));
        return sb.toString();



    }
}



