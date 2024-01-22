package com.praisebassey.docket.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Task {
    @Id
    private String id;
    private String name;
    private String description;
    private boolean isComplete;
    private LocalDate taskDueDate;

    @DBRef
    private User user;

    public Task(){}




    public Task(String name, String description,  LocalDate taskDueDate) {
        this.name = name;
        this.description = description;
        this.isComplete = false;
        this.taskDueDate = taskDueDate;
    }


    public Task(String name,LocalDate taskDueDate) {
        this.name = name;
        this.isComplete = false;
        this.taskDueDate = taskDueDate;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public LocalDate getTaskDueDate() {
        return taskDueDate;
    }

    public void setTaskDueDate(LocalDate taskDueDate) {
        this.taskDueDate = taskDueDate;
    }
}
