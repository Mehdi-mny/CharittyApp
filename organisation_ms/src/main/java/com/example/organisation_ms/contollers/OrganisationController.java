package com.example.organisation_ms.contollers;

import com.example.organisation_ms.entites.Organisation;
import com.example.organisation_ms.services.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/organisations")
public class OrganisationController {
    @Autowired
    private OrganisationService orgInterface;

    @RequestMapping("/getAllOrganisations")
    public List<Organisation> getAllOrganisations(){
        return orgInterface.getAllOrganisations();
    }

    @RequestMapping("/getOrganisationById/{id}")
    public Organisation getOrganisation(@PathVariable Long id){
        return orgInterface.findOrganisationById(id);
    }

    @RequestMapping("/createOrganisation")
    public void createOrganisation(Organisation org){
        orgInterface.createOrganisation(org);
    }

    @RequestMapping("/deleteOrganisation")
    public void deleteOrganisationById(Long id){
        orgInterface.deleteOrganisation(id);
    }
}