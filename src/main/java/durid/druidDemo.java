package durid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.sun.xml.internal.bind.v2.TODO;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class druidDemo {
    /**
     * druid数据库连接池
     * @param args
     */
    public static void main(String[] args) throws Exception{
//        System.out.println(System.getProperty("user.dir"));
//      TODO 1.定义配置文件

//      TODO 2.加载配置文件

        Properties pro = new Properties();
        pro.load(new FileInputStream("src/main/resources/druid.properties"));
//      TODO 3.获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);

//      TODO 获取数据库连接
        Connection connection = dataSource.getConnection();

        System.out.println(connection);


    }
}
