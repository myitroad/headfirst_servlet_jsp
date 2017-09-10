package com.example.entities;

/**
 * Created by LTN on 2016/11/2.
 */
public class Test {
    public int doubleInt() {
        count=count*2;
        return count;
    }

    public int add(int inc) {
        int temp=count+inc;
        int later=1;
        temp=temp+later;
        return temp;
    }

    int count=1;

    public static void main(String[] args) {
        System.out.println(new Test().add(1));
        System.out.println(new Test().doubleInt());
    }
}
