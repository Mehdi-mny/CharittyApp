package com.example.donation_ms.Service;

import com.example.donation_ms.DAO.UserModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("users-ms")
public interface UserModelRestClient {
    @GetMapping("/users/getUserById/{id}")
    UserModel getUserById(@PathVariable long id);
}
