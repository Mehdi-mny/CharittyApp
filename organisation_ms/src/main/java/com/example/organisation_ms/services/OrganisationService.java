package com.example.organisation_ms.services;

import com.example.organisation_ms.entites.Organisation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface OrganisationService {
    public List<Organisation> getAllOrganisations();
    public void createOrganisation(Organisation organisation);
    public Organisation updateOrganisation(Organisation organisation);
    public void deleteOrganisation(Long id);

    public Organisation findOrganisationById(Long id);
}
