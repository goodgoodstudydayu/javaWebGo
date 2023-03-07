package com.zixue.web.response;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/res2")
public class demo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("response2...");
        /**
         * 相应字符数据：设置字符数据的响应体
         */
////        设置返回数据用html解析，设置字符输出流为utf-8
//        resp.setContentType("text/html;charset=utf-8");
////        1.获取字符输出流
//        PrintWriter writer = resp.getWriter();
//
//        writer.write("<h1>哈喽啊</h1>");

        /**
         * 相应字节数据：设置字符数据的响应体
         */

//        1.读取文件
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\wangf\\Pictures\\Default.jpg");

//        2.获取字节输出流
        ServletOutputStream os = resp.getOutputStream();

//        3.完整的copy
        IOUtils.copy(fileInputStream,os);
        fileInputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
