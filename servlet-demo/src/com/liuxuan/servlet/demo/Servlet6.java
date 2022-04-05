package com.liuxuan.servlet.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: liuxuan
 * @date: 2022-03-20 21:34
 * request作用域
 **/
@WebServlet("/ser06")
public class Servlet6 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取域对象
        String name = (String) req.getAttribute("name");
        System.out.println("name：" + name);
        List<String> list = (List<String>) req.getAttribute("list");
    }
}
