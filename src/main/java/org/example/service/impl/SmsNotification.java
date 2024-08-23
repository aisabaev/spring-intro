package org.example.service.impl;

import org.example.service.Notification;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value = "smsNotification")
@Lazy
public class SmsNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("SMS Notification");
    }
}
