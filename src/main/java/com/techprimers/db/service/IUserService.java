package com.techprimers.db.service;

import com.techprimers.db.model.User;

import java.util.List;

public interface IUserService {
    public List<User> getAll();
    public List<User> save(User user);
}
