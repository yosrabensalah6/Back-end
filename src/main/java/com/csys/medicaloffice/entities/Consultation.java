package com.csys.medicaloffice.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date consultationday ;
    private String motif;
    private Number temperature;
    private Number bloodpressure;
    private Number weight;
    @ManyToOne
    private Patient patient;

//    @ManyToOne
//    private LetterToConfer lettreToConfer;
//    @OneToOne(mappedBy = "consultation")
//    private MedicalCertificate medicalCertificate;
//    @OneToOne(mappedBy = "consultation")
//    private  HospitalisationLettre hospitalisationLettre;



}
