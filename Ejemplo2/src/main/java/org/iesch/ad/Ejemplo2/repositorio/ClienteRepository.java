package org.iesch.ad.Ejemplo2.repositorio;

import org.iesch.ad.Ejemplo2.model.Cliente;
import org.iesch.ad.Ejemplo2.model.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
