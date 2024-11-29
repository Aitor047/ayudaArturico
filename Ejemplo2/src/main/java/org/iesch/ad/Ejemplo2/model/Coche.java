package org.iesch.ad.Ejemplo2.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Coche {

    @Id
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private Float precio;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "coche", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<Revision> revisiones = new HashSet<>();

}