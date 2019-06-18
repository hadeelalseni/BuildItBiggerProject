package com.udacity.gradle.builditbigger.backend;

import hadeel.com.javalib.MyJavaJoke;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        MyJavaJoke myJavaJoke = new MyJavaJoke();
        myData = myJavaJoke.getJoke();
        return myData;
    }

    public void setData(String data) {

        myData = data;
    }
}