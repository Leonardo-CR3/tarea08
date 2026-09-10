package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.model.Marca;
import pe.gob.ministeriopublico.backend.repository.MarcaRepository;

@Service
public class MarcaService {

    private final MarcaRepository repo;

    public MarcaService(MarcaRepository repo) { this.repo = repo; }

    public List<Marca> findAll(){ return repo.findAll(); }
    public Optional<Marca> findById(Integer id){ return repo.findById(id); }
    public Marca save(Marca e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
