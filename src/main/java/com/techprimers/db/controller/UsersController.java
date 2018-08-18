package com.techprimers.db.controller;

import com.techprimers.db.model.User;
import com.techprimers.db.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersController {

    @Autowired
    IUserService userService;

    @GetMapping(value = "/all")
    public List<User> getAll() {
        return userService.getAll();
    }
    @PostMapping(value = "/addUser")
    public List<User> persist(@RequestBody final User user){
        return userService.save(user);
    }
}
