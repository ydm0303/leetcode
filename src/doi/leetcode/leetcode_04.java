package doi.leetcode;

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
        * ��һλ�������Ҫ���滻�������滻Ϊ 2����Ȼǰ���ǵڶ�λ���ܳ��� 4���������� 24:xx��25:xx �ȣ�
          �ڶ�λ�������Ҫ���滻�����ݵ�һλ��ʲô�������滻Ϊ 9 ���� 3��
          ����λ���̶�Ϊ :��
          ����λ�������Ҫ���滻���滻Ϊ 5��
          ����λ�������Ҫ���滻���滻Ϊ 9��

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



