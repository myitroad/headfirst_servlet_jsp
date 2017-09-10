package com.example.web;

import com.example.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by LTN on 2016/10/30.
 */
public class BeerSelect extends HttpServlet {
    public void doGet(HttpServletRequest request,
                       HttpServletResponse response)throws IOException ,ServletException{
        response.setContentType("text/html");
        String c = request.getParameter("color");
        BeerExpert expert = new BeerExpert();
        List result = expert.getBrands(c);
        request.setAttribute("styles", result);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)throws IOException,ServletException {
        doGet(request,response);
    }

}
