package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.gob.ministeriopublico.backend.model.Sede;

public interface SedeRepository extends JpaRepository<Sede, Integer> {}
