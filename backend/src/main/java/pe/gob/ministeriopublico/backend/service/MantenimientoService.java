package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.model.Mantenimiento;
import pe.gob.ministeriopublico.backend.repository.MantenimientoRepository;

@Service
public class MantenimientoService {

    private final MantenimientoRepository repo;

    public MantenimientoService(MantenimientoRepository repo) { this.repo = repo; }

    public List<Mantenimiento> findAll(){ return repo.findAll(); }
    public Optional<Mantenimiento> findById(Integer id){ return repo.findById(id); }
    public Mantenimiento save(Mantenimiento e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
