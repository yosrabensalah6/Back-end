package com.csys.medicaloffice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LetterToConfer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Object;

    @OneToOne(cascade = CascadeType.ALL)
    private com.csys.medicaloffice.entities.Consultation Consultation;

    @ManyToOne
    private Confer confer;


}
