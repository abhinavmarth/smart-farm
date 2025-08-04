package com.smartfarm.notification_service.controller;


import com.smartfarm.notification_service.model.Notification;
import com.smartfarm.notification_service.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/send")
    public String send(@RequestBody Notification request) {
        notificationService.sendNotification(request);
        return "Notification sent successfully!";
    }
}

