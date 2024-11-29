package org.iesch.ad.Ejemplo2.repositorio;

import org.iesch.ad.Ejemplo2.model.Coche;
import org.iesch.ad.Ejemplo2.model.Revision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RevisionRepository extends JpaRepository<Revision, Long> {
}
