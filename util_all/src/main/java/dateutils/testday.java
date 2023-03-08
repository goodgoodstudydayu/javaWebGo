package dateutils;

/**
 * @Author : WangFH
 * @create 2023/3/8 16:10
 */
public class testday implements Runnable{
    DateUtils dateUtils = new DateUtils();
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            testday thread_target = new testday();
            //通过new Thread(target,name)的方式创建线程
            Thread thread = new Thread(thread_target,"thread"+i);
            thread.start();
        }


    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000L; i++) {
            String nowDate = dateUtils.getNowDate1("yyyy-MM-dd HH:mm:ss");
            //System.out.println(Thread.currentThread().getName()+"......"+i+"....."+nowDate);
        }
        long stop = System.currentTimeMillis();

        System.out.println((stop-start)/1000);
    }
}
