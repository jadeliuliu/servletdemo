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
@WebServlet("/ser05")
public class Servlet5 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置域对象
        req.setAttribute("name", "admin");
        req.setAttribute("age", 18);
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        req.setAttribute("list", list);
        // 请求转发并跳转到Servlet6，共享同一个req对象
        //req.getRequestDispatcher("ser06").forward(req, resp);
        // 一般是从客户端获取数据，所以跳转到jsp客户端
        // 请求转发跳转到jsp，并通过域对象传递数据
        // html就不行，因为是静态页面，而jsp是动态页面
        req.getRequestDispatcher("attribute.jsp").forward(req, resp);
    }
}
