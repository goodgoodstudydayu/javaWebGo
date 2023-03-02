package com.zixue.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
//loadOnStartup为0或正整数：在服务器启动时创建servlet对象
//为-1：第一次访问时创建对象
@WebServlet(urlPatterns = {"/demo1","/demo3/*"},loadOnStartup = 1)
public class ServletDemo implements Servlet {
    private ServletConfig config;
    /**
     * 初始化方法，servlet第一次访问时被调用，只调用一次
     * @param servletConfig
     * @throws ServletException
     */
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
        System.out.println("init()");
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    /**
     * 提供服务方法，每一次调用服务时执行一次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet 启动了噜啦噜啦嘞绿绿。。。。。。。");
//        根据请求方式不同作不同处理
//        1.获取请求方式
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        String method = request.getMethod();
//        2.判断
        if ("GET".equals(method)){

        }
        else if ("POST".equals(method)) {

        }
    }



    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法，调用一次
     * 1。内存释放
     * 2.服务器关闭
     */
    public void destroy() {
        System.out.println("disjoy");
    }
}
