

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * @Author: wangfh
 * @create 2023/3/7 16:25
 */
public class DateUtils {


    /**
     * 根据格式获取当前日期
     *
     * @param format
     * @return
     */
    public String getNowDate(String format) {
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat(format);
        String today = sf.format(date);
        return today;
    }



    /**
     * 获取i天前的日期
     * @param i
     * @return
     */
    public String getBeforeDate(int i,String format) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -i);
        String yesterday = new SimpleDateFormat(format).format(cal.getTime());
        return yesterday;
    }



    /**
     * 获取date 后day天的日期
     *
     * @param date 格式为 yyyy-MM-dd 的日期字符串
     * @param day 天数
     * @return
     * @throws Exception
     */
    public String getAfterDate(String date, int day) throws Exception {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = "";
        Calendar calendar = getInstance();
        calendar.setTime(sf.parse(date));
        calendar.add(Calendar.DATE, day);
        date1 = sf.format(calendar.getTime());
        return date1;
    }

    /**
     * 获取date 后day天的日期
     * @param date 时间字符串，格式按照format来
     * @param day 天数
     * @param format 与date相匹配的格式
     * @return
     * @throws Exception
     */
    public String getAfterDate(String date, int day,String format) throws Exception {
        SimpleDateFormat sf = new SimpleDateFormat(format);
        String date1 = "";
        Calendar calendar = getInstance();
        calendar.setTime(sf.parse(date));
        calendar.add(Calendar.DATE, day);
        date1 = sf.format(calendar.getTime());
        return date1;
    }


    /**
     * 日期格式转换
     * @param date
     * @param beforeFormat
     * @param afterFormat
     * @return
     */
    public String getOtherDate(String date, String beforeFormat, String afterFormat) {
        SimpleDateFormat before = new SimpleDateFormat(beforeFormat);
        SimpleDateFormat after = new SimpleDateFormat(afterFormat);
        try {
            return after.format(before.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }



    /**
     * 获取两个日期相差的天数
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public String getDiffSecond(String startDate, String endDate) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long diff = 0;
        try {
            Date start = format.parse(startDate);
            Date end = format.parse(endDate);
            diff = (end.getTime() - start.getTime()) / 1000;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return String.valueOf(diff);
    }

    public static void main(String[] args) throws Exception {
        DateUtils dateUtils = new DateUtils();
        String nowDate = dateUtils.getNowDate("yyyy-MM-dd HH:mm:ss");
        String beforeDate = dateUtils.getBeforeDate(2, "yyyy-MM-dd");
        String afterDate = dateUtils.getAfterDate(nowDate, 3,"yyyy-MM-dd HH:mm:ss");
        String otherDate = dateUtils.getOtherDate(nowDate, "yyyy-MM-dd HH:mm:ss", "yyyy/MM/dd");
        String diffSecond = dateUtils.getDiffSecond("2023-03-08 09:55:41", "2023-03-11 09:55:43");
        System.out.println(nowDate);
        System.out.println(beforeDate);
        System.out.println(afterDate);
        System.out.println(otherDate);
        System.out.println(diffSecond);
    }

    public static Calendar getInstance() {
        return Calendar.getInstance();
    }


    public long nextLong(long start, long end) {
        Random random = new Random();
        return start + (long) (random.nextDouble() * (end - start + 1));
    }


}
