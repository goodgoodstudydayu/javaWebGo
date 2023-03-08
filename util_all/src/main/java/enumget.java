import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author : WangFH
 * @create 2023/3/8 14:44
 */
public class enumget {
    enum DataFormatPatternEnum{
        yyyy_MM_dd_HH_mm_ss("yyyy-MM-dd HH:mm:ss"),
        yyyy_MM_dd("yyyy-MM-dd");
        private final String pattern;

        private DataFormatPatternEnum(String pattern){
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat(DataFormatPatternEnum.yyyy_MM_dd.pattern);
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);
    }

}
