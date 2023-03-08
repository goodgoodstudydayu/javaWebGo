package dateutils;

import com.sun.xml.internal.bind.v2.TODO;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Author : WangFH
 * @create 2023/3/8 13:35
 * 日历类
 */
public class Study_Calendar {
    public static void main(String[] args) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        TODO 构造
        Calendar cld = Calendar.getInstance();
//        将给定的日历字段设置为给定的值。
//        cld.set(2022, Calendar.DECEMBER,12);
//        或者
//        cld.set(Calendar.HOUR_OF_DAY, 0);
//        cld.set(Calendar.MINUTE, 0);
//        cld.set(Calendar.SECOND, 0);
//        cld.set(Calendar.MILLISECOND, 0);

//        什么也不设置默认为当前时间
        System.out.println(sdf1.format(cld.getTime()));


//        cld.clear();
//        System.out.println(sdf1.format(cld.getTime()));
//        TODO 获取当前月
        int month = cld.get(Calendar.MONTH)+1;
//        获取当前日
        int day = cld.get(Calendar.DATE);

        cld.add(Calendar.MONTH,-1);
        System.out.println(sdf1.format(cld.getTime()));
        System.out.println(month+"月..."+day+"日");

//        清理设置为1970年
        cld.clear();
//        TODO 设置时间
        cld.set(2023, Calendar.FEBRUARY,28);
        System.out.println(sdf1.format(cld.getTime()));

//        TODO 时间调整函数
        cld.add(Calendar.DAY_OF_MONTH,1);         //会改变更大的数值，月进一：2023-03-01 00:00:00
//        cld.roll(Calendar.DAY_OF_MONTH,1);  //不改变更大的数值，月不会进一：2023-02-01 00:00:00
        System.out.println(sdf1.format(cld.getTime()));
    }
}
