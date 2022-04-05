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
 * @date: 2022-03-26 22:54
 * 创建session
 **/
@WebServlet("/sess01")
public class Session1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // session对象的获取,
        HttpSession session = req.getSession();
        // 获取session的唯一标识--会话标识符
        String id = session.getId();
        System.out.println("唯一标识符号："+id);
        System.out.println("创建时间："+session.getCreationTime());
        System.out.println("最后一次访问时间："+session.getLastAccessedTime());
        System.out.println("是否是新的session对象"+session.isNew());
    }
}
