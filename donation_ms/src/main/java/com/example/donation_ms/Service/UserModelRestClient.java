package com.example.donation_ms.Service;

import com.example.donation_ms.DAO.UserModel;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-ms")
public interface UserModelRestClient {
    @CircuitBreaker(name = "donationCB", fallbackMethod = "fallbackGetUserById")
    @GetMapping("/users/getUserById/{id}")
    public UserModel getUserById(@PathVariable("id") long id);
    default UserModel fallbackGetUserById(long id, Throwable throwable) {
        return UserModel.builder()
                .id(-1L)
                .fullName("Fallback User")
                .email("unknown@example.com")
                .build();
}
}
