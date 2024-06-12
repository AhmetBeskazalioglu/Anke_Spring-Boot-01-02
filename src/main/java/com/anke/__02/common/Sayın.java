package com.anke.__02.common;

public class Sayın implements IAnke{

    public Sayın() {
        System.out.println("Sayın bean is created!");
    }

    @Override
    public String say() {
        return "Sayın, Anke!";
    }
}
