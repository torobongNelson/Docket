package com.praisebassey.docket.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Notification {
    @Id
    private String id;
    @DBRef
    private SupportBuddy buddy;

    @DBRef
    private User user;
    private String message;

    public Notification(SupportBuddy buddy, String message) {
        this.buddy = buddy;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SupportBuddy getBuddy() {
        return buddy;
    }

    public void setBuddy(SupportBuddy buddy) {
        this.buddy = buddy;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
