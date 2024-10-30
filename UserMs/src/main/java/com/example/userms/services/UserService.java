package com.example.userms.services;

import com.example.userms.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    public List<User> listAll();
    public Optional<User> listUser(Long id);
    public void deleteUser(Long id);
    public User UpdateUser(User user);
    public User SaveUser(User user);

}
