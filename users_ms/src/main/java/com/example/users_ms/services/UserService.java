package com.example.users_ms.services;

import com.example.users_ms.entities.Users;

import java.util.List;
public interface UserService {
    public List<Users> getAllUsers();
    public Users createUser(Users user);
    public Users updateUser(Users user);
    public void deleteUser(Long id);
    public  Users findUserById(Long id);

}
