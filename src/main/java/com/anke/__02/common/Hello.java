package com.anke.__02.common;

import org.springframework.stereotype.Component;

@Component
public class Hello implements IAnke{

    public Hello() {
        System.out.println("Hello bean is created!");
    }

    @Override
    public String say() {
        return "Hello, Anke!";
    }
}
