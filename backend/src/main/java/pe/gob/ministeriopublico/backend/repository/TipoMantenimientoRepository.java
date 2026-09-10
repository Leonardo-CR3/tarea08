package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.gob.ministeriopublico.backend.model.TipoMantenimiento;

public interface TipoMantenimientoRepository extends JpaRepository<TipoMantenimiento, Integer> {}
