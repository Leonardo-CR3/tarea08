package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.entity.Equipo;
import pe.gob.ministeriopublico.backend.repository.EquipoRepository;

@Service
public class EquipoService {

    private final EquipoRepository repo;

    public EquipoService(EquipoRepository repo) { this.repo = repo; }

    public List<Equipo> findAll(){ return repo.findAll(); }
    public Optional<Equipo> findById(Integer id){ return repo.findById(id); }
    public Equipo save(Equipo e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
