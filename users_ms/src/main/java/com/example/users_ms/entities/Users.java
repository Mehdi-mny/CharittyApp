package com.example.users_ms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Users {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String fullName;
    private String email;
    private int phone;

}
