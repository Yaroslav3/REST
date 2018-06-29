package com.rest1.rest1.service;

import com.rest1.rest1.model.User;

import java.util.List;

public interface UserService {

    /**
     * @return  instsnse of
     */
    User getOne(Long id);
    List<User> getAll();
    User create(User user);
    User update(User user);
    void delete(User user);
    void delete(Long id);
}
