package com.rest1.rest1.controller;

import com.rest1.rest1.model.Todo;
import com.rest1.rest1.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {
    @Autowired
    TodoService todoService;


    @RequestMapping("/all")
    public List<Todo> getAll() {
        return todoService.getAll();
    }
}
