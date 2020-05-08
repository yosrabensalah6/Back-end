package com.csys.medicaloffice.entities;

import javafx.print.Collation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Confer extends Person implements Serializable {
    private String adresse;
    private String speciality;
    @OneToMany(mappedBy = "confer")
    private Collection<LetterToConfer> letterToConfer;
}
