package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.model.Sede;
import pe.gob.ministeriopublico.backend.repository.SedeRepository;

@Service
public class SedeService {

    private final SedeRepository repo;

    public SedeService(SedeRepository repo) { this.repo = repo; }

    public List<Sede> findAll(){ return repo.findAll(); }
    public Optional<Sede> findById(Integer id){ return repo.findById(id); }
    public Sede save(Sede e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
