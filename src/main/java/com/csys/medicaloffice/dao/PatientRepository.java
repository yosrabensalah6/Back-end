package com.csys.medicaloffice.dao;



import com.csys.medicaloffice.entities.Appointment;
import com.csys.medicaloffice.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;




@CrossOrigin("*")
@RepositoryRestResource
public interface PatientRepository extends JpaRepository<Patient,Long> {
    @RestResource(path = "/byFirstName")
    public Page<Patient> findByFirstnameContains(@Param("mc") String firstname, Pageable Pageable) ;
}
