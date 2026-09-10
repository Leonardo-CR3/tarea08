package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.entity.EstadoEquipo;
import pe.gob.ministeriopublico.backend.repository.EstadoEquipoRepository;

@Service
public class EstadoEquipoService {

    private final EstadoEquipoRepository repo;

    public EstadoEquipoService(EstadoEquipoRepository repo) { this.repo = repo; }

    public List<EstadoEquipo> findAll(){ return repo.findAll(); }
    public Optional<EstadoEquipo> findById(Integer id){ return repo.findById(id); }
    public EstadoEquipo save(EstadoEquipo e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
