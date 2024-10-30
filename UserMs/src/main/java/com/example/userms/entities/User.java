package com.example.userms.entities;

import com.example.userms.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50,nullable = false)
    private String fullName;
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Column(nullable = false)
    private Gender gender;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private Date registrationDate;
    @Column(nullable = false)
    private boolean isActive;
}
