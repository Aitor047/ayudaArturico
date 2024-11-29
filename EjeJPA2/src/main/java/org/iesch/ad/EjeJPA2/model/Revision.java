package org.iesch.ad.EjeJPA2.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Revision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private boolean cambioFiltro;
    private boolean cambioAceite;

    @ManyToOne
    @JoinColumn(name = "coche_id")
    @JsonBackReference
    private Coche coche;


}
