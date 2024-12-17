package com.example.donation_ms.Service;

import com.example.donation_ms.DAO.OrganisationModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("organisation-ms")
public interface OrganisationModelRestClient {
    @GetMapping("/organisations/getOrganisationById/{id}")
    OrganisationModel getOrganisationById(@PathVariable long id);
}