package web;


import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget....");
        // TODO: 2023/3/2 接收用户名密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // TODO: 2023/3/2 调用mybatis查询
        String resource = "mybatis-config.xml";
        InputStream input = Resources.getResourceAsStream(resource);
        SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(input);
        SqlSession sqlSession = fac.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.select(username, password);
        sqlSession.close();

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        // TODO: 2023/3/2  判断是否有user没有则登陆失败
        if (user != null){
            //登陆成功
            writer.write("登陆成功");
        }
        else {
            writer.write("登陆失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
