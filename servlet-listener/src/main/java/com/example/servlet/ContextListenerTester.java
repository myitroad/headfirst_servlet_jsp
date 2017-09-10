package com.example.servlet;

import com.example.entities.Dog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by LTN on 2016/11/2.
 */
public class ContextListenerTester extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("test context attributes set by listener<br>");
        out.println("<br>");

        Dog dog = (Dog) getServletContext().getAttribute("dog");
        out.println("Dog's breed is: " + dog.getBreed());
    }
}
