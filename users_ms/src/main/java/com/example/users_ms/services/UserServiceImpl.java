package com.example.users_ms.services;

import com.example.users_ms.entities.Users;
import com.example.users_ms.repos.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRep userRep;

    @Override
    public List<Users> getAllUsers() {
        return userRep.findAll();
    }

    @Override
    public Users createUser(Users user) {
        return userRep.save(user);
    }

    @Override
    public Users updateUser(Users user) {
        return userRep.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRep.deleteById(id);
    }

    @Override
    public Users findUserById(Long id) {
        return userRep.findById(id).get();
    }
}
