package com.anke.__02.controller;

import com.anke.__02.common.IAnke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Anke_Controller {

    private IAnke anke;

    @Autowired
    public Anke_Controller(
            //@Qualifier("third_party")
            IAnke anke) {
        System.out.println("Anke_Controller bean is created!");
        this.anke = anke;
    }

    @GetMapping("/say")
    public String say() {
        return anke.say();
    }
}
