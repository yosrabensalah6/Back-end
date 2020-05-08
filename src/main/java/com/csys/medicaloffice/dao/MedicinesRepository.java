package com.csys.medicaloffice.dao;

import com.csys.medicaloffice.entities.Medicines;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface MedicinesRepository extends JpaRepository<Medicines,Long> {
    @RestResource(path ="/byName")

    public Page <Medicines> findBynameContains(@Param("mc") String name , Pageable Pageable) ;
}

