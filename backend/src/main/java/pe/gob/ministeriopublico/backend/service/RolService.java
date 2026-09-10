package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.model.Rol;
import pe.gob.ministeriopublico.backend.repository.RolRepository;

@Service
public class RolService {

    private final RolRepository repo;

    public RolService(RolRepository repo) { this.repo = repo; }

    public List<Rol> findAll(){ return repo.findAll(); }
    public Optional<Rol> findById(Integer id){ return repo.findById(id); }
    public Rol save(Rol e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
