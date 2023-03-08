package dateutils;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author : WangFH
 * @create 2023/3/8 11:23
 */
public class Study_SimpleDateFormat {
    public static void main(String[] args) throws Exception{
        Date date = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat clone = (SimpleDateFormat)sdf1.clone();
        boolean equals = sdf1.equals(clone);

//      将给定的Date格式化为日期/时间字符串。
        String time = sdf1.format(date);

//      解析字符串中的文本以生成日期。
        Date parse = sdf2.parse("2022-01-02");

        System.out.println(equals);
        System.out.println(time);
        System.out.println(parse);

        //返回描述此日期格式的模式字符串。
        System.out.println(sdf1.toPattern());

        SimpleDateFormat ss = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar ca = ss.getCalendar();
        ca.set(Calendar.YEAR,2023);
        System.out.println(ss.format(ca.getTime()));
    }
}
