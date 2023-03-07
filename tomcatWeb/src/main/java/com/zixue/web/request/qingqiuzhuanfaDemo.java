package com.zixue.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/demo4")
public class qingqiuzhuanfaDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("请求转发");
        req.setAttribute("msg","哈喽");
//        不需要加虚拟目录
        req.getRequestDispatcher("/demo2").forward(req,resp);
//        向request中插入键值对数据
        req.setAttribute("","");
//        获取
        req.getAttribute("");
//        删除
        req.removeAttribute("");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);

    }
}
