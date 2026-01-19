package com.praveen.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.praveen.demo.Entity.ToDoList;
import com.praveen.demo.Repository.ToDoListRepository;
import java.util.List;

@Service
public class ToDoListServiceImpl implements ToDoListService {

    @Autowired
    private ToDoListRepository taskRepository;

    @Override
    public List<ToDoList> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public ToDoList addTask(ToDoList task) {
        return taskRepository.save(task);
    }

    @Override
    public ToDoList updateTask(int id, ToDoList task) {
        ToDoList existingTask = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        existingTask.setTask(task.getTask());
        existingTask.setStatus(task.getStatus());

        return taskRepository.save(existingTask);
    }

    @Override
    public void deleteTask(int id) {
        taskRepository.deleteById(id);
    }
}
