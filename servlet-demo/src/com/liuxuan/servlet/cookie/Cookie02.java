package com.liuxuan.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: liuxuan
 * @date: 2022-03-26 11:04
 * cookie的返回，是数组
 **/
@WebServlet("/coo2")
public class Cookie02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取cookie数组
        Cookie[] cookies = req.getCookies();
        // 非空判断
        if(cookies != null && cookies.length >0){
            // 遍历cookie数组
            for(Cookie cookie : cookies){
                String name = cookie.getName();
                String value = cookie.getValue();
                System.out.println("名称："+name+"--值："+value);
            }
        }
    }
}
