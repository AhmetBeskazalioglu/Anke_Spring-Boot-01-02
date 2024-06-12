package com.anke.__02.config;

import com.anke.__02.common.IAnke;
import com.anke.__02.common.Sayın;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Third_Party_Methods {

    @Bean("third_party")
    public IAnke sayın() {
        return new Sayın();
    }

}
