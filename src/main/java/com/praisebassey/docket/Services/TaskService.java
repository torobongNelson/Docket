package com.praisebassey.docket.Services;

import com.praisebassey.docket.Exceptions.TaskNotFoundException;
import com.praisebassey.docket.Interfaces.TaskServiceInterface;
import com.praisebassey.docket.Models.Task;
import com.praisebassey.docket.Repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements TaskServiceInterface {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task viewTask(String id) {
        return taskRepository.findById(id).orElseThrow(()-> new TaskNotFoundException("Task not found"));
    }

    @Override
    public List<Task> viewTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(String id) {
        taskRepository.deleteById(id);
    }
}
