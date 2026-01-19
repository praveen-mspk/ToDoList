package com.praveen.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.praveen.demo.Entity.ToDoList;

public interface ToDoListRepository extends JpaRepository<ToDoList,Integer> {

}
