package org.iesch.ad.EjeJPA2.repository;

import org.iesch.ad.EjeJPA2.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // EVITAR N+1 CONSULTAS
    @Query("SELECT c FROM Cliente c JOIN FETCH c.coches co JOIN FETCH co.revisiones Where c.id = :id")
    Cliente findIdOptimizado(Long id);
}
