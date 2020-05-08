package com.csys.medicaloffice.dao;

import com.csys.medicaloffice.entities.SocialSecurityAffiliation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface SocialSecurityAffiliationRepository extends JpaRepository<SocialSecurityAffiliation,Long> {
}
