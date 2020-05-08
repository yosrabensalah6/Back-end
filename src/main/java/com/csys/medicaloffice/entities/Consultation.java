package com.csys.medicaloffice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Consultation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateOfCons;
    private int pattern;
    private float temperature;
    private float BloodPressure;
    private float weight;
    @ManyToOne
    private Patient patient;

    @ManyToOne
    private LetterToConfer lettreToConfer;
    @OneToOne(mappedBy = "consultation")
    private MedicalCertificate medicalCertificate;
    @OneToOne(mappedBy = "consultation")
    private  HospitalisationLettre hospitalisationLettre;







}
