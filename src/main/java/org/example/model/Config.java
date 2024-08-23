package org.example.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan( basePackages = "org.example.*")
public class Config {

    @Bean(value = "kiki")
    @Lazy
    Parrot parrot(){
        Parrot parrot = new Parrot();
        parrot.setName("Kiki");
        return parrot;
    }

    @Bean
    @Lazy
    Person person(Parrot parrot){
        Person person = new Person();
        person.setName("John");
        person.setParrot(parrot);
        return person;
    }

}
