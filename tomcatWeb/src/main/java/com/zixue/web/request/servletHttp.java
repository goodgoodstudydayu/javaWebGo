package com.zixue.web.request;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet("/demo2")
public class servletHttp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo2...");
        Object msg = req.getAttribute("msg");
        System.out.println(msg.toString());
        //        解决中文乱码    post 通过gatreader()通过流来获取参数
//        req.setCharacterEncoding("UTF-8");//设置字符输入流
//
//        //get 通过url编码传到服务器端解码编码格式不同导致乱码  所以先转为二进制再转为utf-8
//        byte[] usernames = req.getParameter("username").getBytes(StandardCharsets.ISO_8859_1);
//        String userN = new String(usernames, StandardCharsets.UTF_8);
//
////        获取所有请求参数的map
//        req.getParameterMap();
////        通过参数键的名称获取值
//        req.getParameterValues("");
////        通过参数键的名称获取一个值
//        String username = req.getParameter("username");
//        System.out.println(username);



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
