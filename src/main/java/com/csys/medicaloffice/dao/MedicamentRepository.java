package com.csys.medicaloffice.dao;

import com.csys.medicaloffice.entities.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface MedicamentRepository extends JpaRepository<Medicament,Long> {
}
