package com.anke.__02.common;

import org.springframework.stereotype.Component;

@Component
public class Hi implements IAnke{

    public Hi() {
        System.out.println("Hi bean is created!");
    }

    @Override
    public String say() {
        return "Hi, Anke!";
    }
}
