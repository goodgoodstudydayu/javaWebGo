package jdbc;

import pojo.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBC查询 {
    public static void main(String[] args) throws Exception{
//        注册驱动
//        Driver类中会调用 DriverManager.registerDriver(new Driver());来注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
//        获取连接对象（如果连接的是本机端口号3306则可以省略不写）
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false&serverTimezone=UTC";
        String username = "root";
        String password = "8023";
        //  DriverManager    1.注册驱动          2.获取数据库连接
//          Connection       1.获取执行SQL对象    2.管理事务
        Connection connection = DriverManager.getConnection(url, username, password);
        String sql1 = "select * from tb_stu";
        String sql2 = "insert into db1.tb_stu(id,name,gender,birthday,score,email,tel) values (1001,'xiaohong','女','2000-06-12',72,'54321@email.com','1233321')";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql1);
        ArrayList<Account> lis = new ArrayList<Account>();

        while (rs.next()){
            Account ac = new Account();
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double score = rs.getDouble("score");
            ac.setId(id);
            ac.setName(name);
            ac.setMoney(score);
            lis.add(ac);
        }
        System.out.println(lis);
        statement.close();
        connection.close();
    }
}
