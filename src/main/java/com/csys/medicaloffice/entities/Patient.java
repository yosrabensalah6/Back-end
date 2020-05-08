package com.csys.medicaloffice.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Patient extends Person implements Serializable {

    private Number  DateOfCreation;
    private Number DateOfBirth;
    private  String sexe;
    private  Long numMatCNAM;
    private String typeCNAM;
    private Number DateValCNAM;
    private Long codeAPCI;

}
