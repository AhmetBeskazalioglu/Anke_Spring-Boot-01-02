package com.anke.__02.common;

import org.springframework.stereotype.Component;

@Component
public class Merhaba implements IAnke{

    public Merhaba() {
        System.out.println("Merhaba bean is created!");
    }

    @Override
    public String say() {
        return "Merhaba, Anke!";
    }
}
