package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.model.Clasificacion;
import pe.gob.ministeriopublico.backend.repository.ClasificacionRepository;

@Service
public class ClasificacionService {

    private final ClasificacionRepository repo;

    public ClasificacionService(ClasificacionRepository repo) { this.repo = repo; }

    public List<Clasificacion> findAll(){ return repo.findAll(); }
    public Optional<Clasificacion> findById(Integer id){ return repo.findById(id); }
    public Clasificacion save(Clasificacion e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
