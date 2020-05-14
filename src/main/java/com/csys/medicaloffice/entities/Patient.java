package com.csys.medicaloffice.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Patient extends Person implements Serializable {
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date  creationday;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date birthday;
    private  String sexe;
    private  Long numMatCNAM;
    private String typeCNAM;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date validationday;
    private Long codeAPCI;
    @OneToMany(mappedBy = "patient")
    private Collection<Consultation> Consultations;
    @OneToMany(mappedBy = "patient")
    private Collection<MedicalCertificate> medicalCertificates;
    @OneToMany(mappedBy = "patient")
    private Collection<Ordonnance> ordonnances;
    @OneToMany(mappedBy = "patient")
   private  Collection<LetterToConfer> letterToConfers;
    @OneToMany(mappedBy = "patient")
    private  Collection<HospitalisationLettre> hospitalisationLettres;

}
