package com.anke.__02.common;

import org.springframework.stereotype.Component;

@Component
public class Naber implements IAnke{

    public Naber() {
        System.out.println("Naber bean is created!");
    }

    @Override
    public String say() {
        return "Naber, Anke!";
    }
}
