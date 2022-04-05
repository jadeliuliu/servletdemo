package com.liuxuan.servlet.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: liuxuan
 * @date: 2022-03-20 09:41
 **/
@WebServlet("/ser03")
public class Servlet3 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码格式
        req.setCharacterEncoding("UTF-8");
        /**
         * 常用方法
         */
        // 获取请求时的完整路径（从http开始，到？前面结束）
        String url = req.getRequestURL() +"";
        System.out.println("url:"+url);
        // 获取请求时的部分路径（从项目的站点名称开始，到？前面结束）
        String uri = req.getRequestURI();
        System.out.println("uri:"+uri);
        // 获取请求时的参数字符串（从？开始）
        String queryString = req.getQueryString();
        System.out.println("queryString:"+queryString);
        // 获取请求方式
        String method = req.getMethod();
        System.out.println("method:"+method);
        // 获取当前协议版本
        String protocol = req.getProtocol();
        System.out.println("protocol:"+protocol);
        // 获取项目的站点名
        String webApp = req.getContextPath();
        System.out.println("webApp:"+webApp);

        /**
         * 获取请求的参数
         * http://localhost:8080/servlet_demo/ser03?uname=lili&upwd=lslsls&input=111&input=222&input=333
         */
        // 获取指定名称的参数值,返回字符串
        String uname = req.getParameter("uname");
        String upwd = req.getParameter("upwd");
        System.out.println("uname:"+uname);
        System.out.println("upwd:"+upwd);

        // 获取指定名称的参数的所有参数值,返回字符串数组（用于复选框传值）
        String[] strings = req.getParameterValues("input");
        if(strings != null && strings.length > 0){
            for(String s : strings){
                System.out.println("strings:"+s);
            }
        }
    }
}
