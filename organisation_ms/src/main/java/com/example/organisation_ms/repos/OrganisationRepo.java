package com.example.organisation_ms.repos;

import com.example.organisation_ms.entites.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganisationRepo extends JpaRepository<Organisation,Long> {
}
