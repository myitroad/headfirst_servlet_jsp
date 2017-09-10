package com.example.entities;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Created by LTN on 2016/11/2.
 */
public class Dog implements HttpSessionBindingListener {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("I am a dog, i know i am in a conversation now.");
    }

    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("I am a dog, i know i am leaving a conversation now.");
    }
}
