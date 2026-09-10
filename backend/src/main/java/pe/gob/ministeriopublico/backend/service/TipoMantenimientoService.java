package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.entity.TipoMantenimiento;
import pe.gob.ministeriopublico.backend.repository.TipoMantenimientoRepository;

@Service
public class TipoMantenimientoService {

    private final TipoMantenimientoRepository repo;

    public TipoMantenimientoService(TipoMantenimientoRepository repo) { this.repo = repo; }

    public List<TipoMantenimiento> findAll(){ return repo.findAll(); }
    public Optional<TipoMantenimiento> findById(Integer id){ return repo.findById(id); }
    public TipoMantenimiento save(TipoMantenimiento e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
