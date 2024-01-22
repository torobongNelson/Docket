package com.praisebassey.docket.Controllers;

import com.praisebassey.docket.Models.Task;
import com.praisebassey.docket.Services.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> viewTasks(){
       List<Task> tasks = taskService.viewTasks();
       return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> viewTask(@PathVariable("id") String id){
       Task task = taskService.viewTask(id);
       return new ResponseEntity<>(task,HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<Task> createTask(@RequestBody Task task){
       Task createdTask = taskService.createTask(task);
       return new ResponseEntity<>(createdTask,HttpStatus.CREATED);
    }


    @PutMapping("/update")
    public ResponseEntity<Task> updateTask(@RequestBody Task task){
        Task updatedTask = taskService.updateTask(task);
        return new ResponseEntity<>(updatedTask,HttpStatus.CREATED);
    }

    @DeleteMapping ("/delete/{taskId}")
    public ResponseEntity<?> deleteTask(@PathVariable("taskId") String taskId){
        taskService.deleteTask(taskId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
