package com.rest1.rest1.service.impl;


import com.rest1.rest1.model.Todo;
import com.rest1.rest1.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoService todoService;

    @Override
    public Todo getOne(Long id) {
        return todoService.getOne(id);
    }

    @Override
    public List<Todo> getAll() {
        return todoService.getAll();
    }

    @Override
    public Todo create(Todo todo) {
        return todoService.create(todo);
    }

    @Override
    public Todo update(Todo todo) {
        return todoService.update(todo);
    }

    @Override
    public void delete(Todo todo) {
        todoService.delete(todo);
    }

    @Override
    public void delete(Long id) {
        todoService.delete(id);
    }
}
