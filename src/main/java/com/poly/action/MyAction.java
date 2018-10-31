package com.poly.action;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport {

    public MyAction (){

    }

    @Override
    public String execute() throws Exception {
        return "SUCCESS";
    }
}
