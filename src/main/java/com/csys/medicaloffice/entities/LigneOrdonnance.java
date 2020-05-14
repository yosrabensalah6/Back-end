package com.csys.medicaloffice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LigneOrdonnance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Number dosage;
    private Number nbprise;
    @ManyToOne
    private Ordonnance ordonnance;
    @ManyToOne
    private  Medicament medicament;
}
