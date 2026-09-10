package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.gob.ministeriopublico.backend.model.Rol;

public interface RolRepository extends JpaRepository<Rol, Integer> {}
