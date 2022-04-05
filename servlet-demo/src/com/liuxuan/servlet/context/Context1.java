package com.liuxuan.servlet.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: liuxuan
 * @date: 2022-03-29 09:19
 **/
@WebServlet("/con01")
public class Context1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) {
        ServletContext servletContext = req.getServletContext();
        //常用方法
        //获取当前服务器的版本信息
        String ServletInfo = servletContext.getServerInfo();
        System.out.println("服务器当前的版本信息：" + ServletInfo);
        //获取项目的真实路径
        String realPath = servletContext.getRealPath("/");     //表示获取根路径
        System.out.println("获取项目的真实路径：" + realPath);
    }
}
