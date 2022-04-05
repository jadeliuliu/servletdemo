package com.liuxuan.servlet.demo;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: liuxuan
 * @date: 2022-03-22 08:50
 * 重定向 302
 **/
@WebServlet("/ser08")
public class Servlet8 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ser08");
        String uname = req.getParameter("uname");
        System.out.println("ser08:"+uname);
        resp.sendRedirect("ser07");
        resp.sendRedirect("https://www.baidu.com");
    }
}
