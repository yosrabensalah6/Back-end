package com.csys.medicaloffice.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ordonnances implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date;
    @OneToMany(mappedBy = "ordonnance")
    private Collection<Medicament> medicament;
    @ManyToOne
    private Patient patient;
}
