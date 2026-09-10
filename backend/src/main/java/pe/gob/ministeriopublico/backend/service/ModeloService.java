package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.entity.Modelo;
import pe.gob.ministeriopublico.backend.repository.ModeloRepository;

@Service
public class ModeloService {

    private final ModeloRepository repo;

    public ModeloService(ModeloRepository repo) { this.repo = repo; }

    public List<Modelo> findAll(){ return repo.findAll(); }
    public Optional<Modelo> findById(Integer id){ return repo.findById(id); }
    public Modelo save(Modelo e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
