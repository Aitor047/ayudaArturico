package org.iesch.ad.Ejemplo2.repositorio;

import org.iesch.ad.Ejemplo2.model.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepository extends JpaRepository<Coche, String> {
}
