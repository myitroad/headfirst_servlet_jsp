package com.example.listener;

import com.example.entities.Dog;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

/**
 * Created by LTN on 2016/11/2.
 */
public class DogServletContextListener implements javax.servlet.ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {
        ServletContext sc = event.getServletContext();
        String dogBreed = sc.getInitParameter("breed");
        Dog d = new Dog(dogBreed);
        sc.setAttribute("dog", d);
    }

    public void contextDestroyed(ServletContextEvent event) {
        //do nothing.
    }
}
