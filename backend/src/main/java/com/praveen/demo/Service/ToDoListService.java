package com.praveen.demo.Service;

import java.util.List;
import com.praveen.demo.Entity.ToDoList;

public interface ToDoListService {

    List<ToDoList> getAllTasks();

    ToDoList addTask(ToDoList todolist);

    ToDoList updateTask(int id, ToDoList todolist);

    void deleteTask(int id);
}
