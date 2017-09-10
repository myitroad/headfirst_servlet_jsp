package com.example.servlet;

import com.example.listener.GlobalCounterListener;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by LTN on 2016/11/2.
 */
public class GlobalCounterTester extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();
        session.setAttribute("name","counter");
        String name=(String)session.getAttribute("name");

        int activeSessions= GlobalCounterListener.getActiveSessions();

        out.println("name: "+name);
        out.println("activeSessions: "+activeSessions);
    }
}
