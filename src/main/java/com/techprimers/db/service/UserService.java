package com.techprimers.db.service;
import com.techprimers.db.model.User;
import com.techprimers.db.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService implements IUserService {
    @Autowired
    UsersRepository usersRepository;
    @Override
    public List<User> getAll() {
            return usersRepository.findAll();
    }

    @Override
    public List<User> save(User user) {
         usersRepository.save(user);
         return usersRepository.findAll();
    }
}
