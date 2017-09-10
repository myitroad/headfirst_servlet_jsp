package com.example.servlet;

import com.example.entities.Dog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by LTN on 2016/11/2.
 */
public class EntityBindingTester extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException {

        Dog dog = (Dog) getServletContext().getAttribute("dog");

        HttpSession session = request.getSession();
        session.setAttribute("dog-binding",dog);
        session.invalidate();
    }

}
