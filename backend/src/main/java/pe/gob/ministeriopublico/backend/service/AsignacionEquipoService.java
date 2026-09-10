package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.model.AsignacionEquipo;
import pe.gob.ministeriopublico.backend.repository.AsignacionEquipoRepository;

@Service
public class AsignacionEquipoService {

    private final AsignacionEquipoRepository repo;

    public AsignacionEquipoService(AsignacionEquipoRepository repo) { this.repo = repo; }

    public List<AsignacionEquipo> findAll(){ return repo.findAll(); }
    public Optional<AsignacionEquipo> findById(Integer id){ return repo.findById(id); }
    public AsignacionEquipo save(AsignacionEquipo e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
