package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.model.Despacho;
import pe.gob.ministeriopublico.backend.repository.DespachoRepository;

@Service
public class DespachoService {

    private final DespachoRepository repo;

    public DespachoService(DespachoRepository repo) { this.repo = repo; }

    public List<Despacho> findAll(){ return repo.findAll(); }
    public Optional<Despacho> findById(Integer id){ return repo.findById(id); }
    public Despacho save(Despacho e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
