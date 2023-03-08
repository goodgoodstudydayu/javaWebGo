package dateutils;

import java.time.Instant;
import java.util.Date;

/**
 * @Author : WangFH
 * @create 2023/3/8 10:09
 */
public class Study_Date {
    public static void main(String[] args) {
        //用该构造方法创建的对象可以获取本地的当前时间。
        Date date1 = new Date();

        //此种形式表示从 GMT 时间（格林尼治时间）1970 年 1 月 1 日 0 时 0 分 0 秒开始经过参数 date 指定的毫秒数。
        Date date2 = new Date(1678242306530L-86400000L);

        //判断date1是否在date2之前
        boolean isbefore = date1.before(date2);

        //判断date1是否在date2之后
        boolean isafter = date1.after(date2);

        //clone一个新日期对象
        Date clone = (Date)date1.clone();

        //比较两个日期，如果参数Date等于此Date，则值为0;如果Date1在Date2参数之前，则该值小于0;如果Date1在Date2参数之后，则该值大于0。
        int i = date1.compareTo(date2);

        //比较两个日期是否相等。当且仅当参数不为空并且是表示与此对象相同时间点(单位为毫秒)的Date对象时，结果为真。
        //因此，当且仅当getTime方法为两个Date对象返回相同的长值时，两个Date对象是相等的。
        boolean issame = date1.equals(date2);


        Date from = Date.from(Instant.now());

        //返回由此Date对象表示的自格林尼治时间1970年1月1日00:00:00以来的毫秒数。
        long time = date1.getTime();

        //将此Date对象设置为表示格林尼治标准时间1970年1月1日00:00:00之后的时间点毫秒。
        date1.setTime(1678242306530L-86400000L);

        //转为Instant类型
        Instant instant = date1.toInstant();

        System.out.println(instant);
//        System.out.println(Instant.now());

        //对象地址
//        System.out.println(System.identityHashCode(date1));
//        System.out.println(System.identityHashCode(clone));
//        System.out.println(date1.before(date2));
    }
}
