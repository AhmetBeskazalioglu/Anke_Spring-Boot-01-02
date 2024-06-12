package com.anke.__02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Selam implements IAnke{

    public Selam() {
        System.out.println("Selam bean is created!");
    }

    @Override
    public String say() {
        return "Selam, Anke!";
    }
}
