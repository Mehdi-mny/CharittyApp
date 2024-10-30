package com.example.userms.services;

import com.example.userms.entities.User;
import com.example.userms.repos.UserRepo;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService{
    UserRepo UserRepo;
    @Override
    public List<User> listAll() {
        return UserRepo.findAll();
    }

    @Override
    public Optional<User> listUser(Long id) {
        return UserRepo.findById(id);
    }

    @Override
    public void deleteUser(Long id) {
        UserRepo.deleteById(id);
    }

    @Override
    public User UpdateUser(User user) {
        return UserRepo.save(user);
    }

    @Override
    public User SaveUser(User user) {
        return UserRepo.save(user);
    }
}
