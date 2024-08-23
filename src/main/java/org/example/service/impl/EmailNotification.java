package org.example.service.impl;

import org.example.service.Notification;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value = "emailNotification")
@Lazy
public class EmailNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("EMAIL Notification");
    }
}
