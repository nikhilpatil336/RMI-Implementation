package com.example.RMIServer.service.impl;

import com.example.RMIServer.service.HelloWorldRMI;

public class HelloWorldRMIImpl implements HelloWorldRMI {

    @Override
    public String sayHelloRmi(String msg) {
        return "Hello " + msg;
    }

    @Override
    public Integer randomNumber() {
        return (int) (Math.random() * 10);
    }
}
