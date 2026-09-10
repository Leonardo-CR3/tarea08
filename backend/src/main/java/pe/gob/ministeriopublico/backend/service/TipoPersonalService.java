package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.entity.TipoPersonal;
import pe.gob.ministeriopublico.backend.repository.TipoPersonalRepository;

@Service
public class TipoPersonalService {

    private final TipoPersonalRepository repo;

    public TipoPersonalService(TipoPersonalRepository repo) { this.repo = repo; }

    public List<TipoPersonal> findAll(){ return repo.findAll(); }
    public Optional<TipoPersonal> findById(Integer id){ return repo.findById(id); }
    public TipoPersonal save(TipoPersonal e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
