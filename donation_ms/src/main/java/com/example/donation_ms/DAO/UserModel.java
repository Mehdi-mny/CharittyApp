package com.example.donation_ms.DAO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserModel {
    private Long id;
    private String fullName;
    private String email;
    private int phone;
}
