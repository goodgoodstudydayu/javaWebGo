package com.zixue.web.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/res1")
public class demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("response1...");
//        1.浏览器地址栏发生变化
//        2.可以重定向到任意资源
//        3.两个请求不可以通过request共享数据

////        设置重定向
//        resp.setStatus(302);
////        设置响应头
//        resp.setHeader("Location","/tomcatWeb/res2");

//        简化重定向
        resp.sendRedirect("/tomcatWeb/res2");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
