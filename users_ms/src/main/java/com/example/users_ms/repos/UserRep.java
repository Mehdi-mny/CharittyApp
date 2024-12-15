package com.example.users_ms.repos;

import com.example.users_ms.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep extends JpaRepository<Users,Long> {

}
