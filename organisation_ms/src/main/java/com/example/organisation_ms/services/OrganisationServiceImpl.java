package com.example.organisation_ms.services;

import com.example.organisation_ms.entites.Organisation;
import com.example.organisation_ms.repos.OrganisationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrganisationServiceImpl implements OrganisationService{
    @Autowired
    private OrganisationRepo organisationRepo;

    @Override
    public List<Organisation> getAllOrganisations() {
        return organisationRepo.findAll();
    }

    @Override
    public void createOrganisation(Organisation organisation) {
        organisationRepo.save(organisation);
    }

    @Override
    public Organisation updateOrganisation(Organisation organisation) {
        return organisationRepo.save(organisation);
    }

    @Override
    public void deleteOrganisation(Long id) {
        organisationRepo.deleteById(id);    
    }

    @Override
    public Organisation findOrganisationById(Long id) {
        return organisationRepo.findById(id).get();
    }
}
