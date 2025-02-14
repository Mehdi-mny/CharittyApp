package com.example.donation_ms.DAO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrganisationModel {
    private Long id;
    private String name;
    private String address;
    private String contact;
}