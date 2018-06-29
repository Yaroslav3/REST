package com.rest1.rest1.service;

import com.rest1.rest1.model.Todo;

import java.util.List;

public interface TodoService {

    Todo getOne(Long id);

    List<Todo> getAll();

    Todo create(Todo todo);

    Todo update(Todo todo);

    void delete(Todo todo);

    void delete(Long id);
}
