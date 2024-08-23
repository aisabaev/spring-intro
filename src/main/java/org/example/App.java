package org.example;

import org.example.model.Config;
import org.example.model.Counter;
import org.example.model.Parrot;
import org.example.model.Person;
import org.example.service.Notification;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * Hello world!
 *
 */

public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
//        Parrot parrot = context.getBean(Parrot.class);
//        System.out.println(parrot.getName());
//
//
//        Person person = context.getBean(Person.class);
//        System.out.println(person.getName());
//        System.out.println(person.getName() + "`s parrot name: " + person.getParrot().getName());
//
//        Notification notification = context.getBean("emailNotification", Notification.class);
//        notification.sendNotification();

        Counter counter = context.getBean(Counter.class);
        counter.setCounter(10000);


        Counter counter1 = context.getBean(Counter.class);
        System.out.println("Counter: " + counter1.getCounter());

//       String[] beans =  context.getBeanDefinitionNames();
//        System.out.println(Arrays.toString(beans));
    }
}
