package com.example.donation_ms.DAO;

import lombok.Data;

@Data
public class UserModel {
    private Long id;
    private String fullName;
    private String email;
    private int phone;
}
