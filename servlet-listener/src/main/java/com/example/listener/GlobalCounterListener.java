package com.example.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by LTN on 2016/11/2.
 */
public class GlobalCounterListener implements HttpSessionListener {
    static private int activeSessions;

    public static int getActiveSessions() {
        return activeSessions;
    }

    public void sessionCreated(HttpSessionEvent event) {
        activeSessions++;
    }

    public void sessionDestroyed(HttpSessionEvent event) {
        activeSessions--;
    }
}
