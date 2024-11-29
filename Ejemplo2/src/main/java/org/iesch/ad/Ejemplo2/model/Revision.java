package org.iesch.ad.Ejemplo2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Revision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean cambioFiltro;
    private boolean cambioAceite;

    @ManyToMany
    @JoinColumn(name = "coche_id")
    private Coche coche;

}
