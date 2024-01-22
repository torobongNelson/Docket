package com.praisebassey.docket.Services;

import com.praisebassey.docket.Interfaces.NotificationServiceInterface;
import com.praisebassey.docket.Models.Notification;
import com.praisebassey.docket.Repositories.NotificationRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationService implements NotificationServiceInterface {
    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public Notification createNotification(Notification notification) {
        return notificationRepository.save(notification);
    }
}
