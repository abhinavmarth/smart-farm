package com.smartfarm.notification_service.service;

import com.smartfarm.notification_service.model.Notification;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void sendNotification(Notification request) {
        System.out.println("Sending notification to " + request.getRecipient());
        System.out.println("Subject: " + request.getSubject());
        System.out.println("Message: " + request.getMessage());
    }
}
