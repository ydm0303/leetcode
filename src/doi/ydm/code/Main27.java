package doi.ydm.code;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName Main27
 * @Description TODO
 * @Author YDM
 * @Date 2021/8/27 20:54
 **/
public class Main27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        int time = calendar.getMinimalDaysInFirstWeek();
        System.out.println(time);


    }

    static boolean getWeek(Date date){
        String[] weeks={"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week_index = cal.get(Calendar.DAY_OF_WEEK)-1;

        return true;
    }

}
