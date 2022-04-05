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
 * cookie的创建和发送
 **/
@WebServlet("/coo1")
public class Cookie01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建cookie name唯一
        Cookie cookie = new Cookie("name", "pwd");
        // 发送（响应）cookie
        resp.addCookie(cookie);
    }
}
