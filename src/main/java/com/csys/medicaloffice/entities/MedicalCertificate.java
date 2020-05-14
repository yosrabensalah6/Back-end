package com.csys.medicaloffice.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MedicalCertificate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateinsert;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date datedebut;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date datefin;
    @ManyToOne
    private Patient patient;

}
