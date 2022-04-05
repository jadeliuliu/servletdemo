package com.liuxuan.servlet.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author: liuxuan
 * @date: 2022-03-27 09:50
 **/
@WebServlet("/sess02")
public class Session2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("uname", "lili");
        session.setAttribute("pwd", "123");
        session.removeAttribute("pwd");
        req.setAttribute("name", "lili");
        // 请求转发跳转到jsp页面，请求转发，一次请求，request可以拿到，session也可以拿到
        //req.getRequestDispatcher("sess01.jsp").forward(req, resp);
        // 重定向跳转到jsp页面,两次请求，request失效，但是session可以拿到
        resp.sendRedirect("sess01.jsp");
    }
}
