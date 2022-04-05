package com.liuxuan.servlet.context;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: liuxuan
 * @date: 2022-03-29 09:19
 **/
@WebServlet("/con02")
public class Context2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) {
        ServletContext servletContext = getServletContext();
        // 设置域对象
        servletContext.setAttribute("name", "张三");
        // 获取域对象
        String name = (String) servletContext.getAttribute("name");
        System.out.println(name);
        // 移除域对象
        servletContext.removeAttribute("name");
    }
}
