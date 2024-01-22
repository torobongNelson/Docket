package com.praisebassey.docket.Interfaces;

import com.praisebassey.docket.Models.Task;

import java.util.List;

public interface TaskServiceInterface {
   Task createTask(Task task);
   Task viewTask(String id);
   List<Task> viewTasks();
   Task updateTask(Task task);
   void deleteTask(String id);

}
