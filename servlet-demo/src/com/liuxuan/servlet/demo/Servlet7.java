package com.liuxuan.servlet.demo;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: liuxuan
 * @date: 2022-03-22 08:50
 * getWriter() 字符输出流(输出字符串)
 * getOutputStream() 字节输出流(输出一切数据)
 **/
@WebServlet("/ser07")
public class Servlet7 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        System.out.println("ser08:"+uname);
//        // getWrite获取字符输出流
//        PrintWriter writer = resp.getWriter();
//        // 输出数据
//        writer.write("hello");

        // getOutputStream字节输出流
//        // 设置服务端的编码格式
//        resp.setCharacterEncoding("UTF-8");
//        // 设置客户端的编码格式和响应类型
//        resp.setHeader("content-type", "text/html;charset=UTF-8");
        // 同时设置服务端和客户端的编码格式
        resp.setContentType("text/html;charset=UTF-8");
        ServletOutputStream out = resp.getOutputStream();
        // 输出数据
        //out.write("hi".getBytes());
        out.write("<h2>你好</h2>".getBytes());
    }
}
