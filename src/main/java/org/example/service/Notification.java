package org.example.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public interface Notification {

    void sendNotification();
}
