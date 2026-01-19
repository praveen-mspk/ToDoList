package com.praveen.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praveen.demo.Entity.ToDoList;
import com.praveen.demo.Service.ToDoListService;

@RestController
@RequestMapping("/api/todolist")
@CrossOrigin(origins = "http://localhost:3000")
public class ToDoListController {
    
    @Autowired
    private ToDoListService service;

    @GetMapping
    public List<ToDoList> getAllTasks() {
        return service.getAllTasks();
    }

    @PostMapping
    public ToDoList addTask(@RequestBody ToDoList task) {
        return service.addTask(task);
    }

    @PutMapping("/{id}")
    public ToDoList updateTask(@PathVariable int id, @RequestBody ToDoList task) {
        return service.updateTask(id, task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id) {
        service.deleteTask(id);
    }
}
