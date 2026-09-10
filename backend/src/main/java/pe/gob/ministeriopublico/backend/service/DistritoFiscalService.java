package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.entity.DistritoFiscal;
import pe.gob.ministeriopublico.backend.repository.DistritoFiscalRepository;

@Service
public class DistritoFiscalService {

    private final DistritoFiscalRepository repo;

    public DistritoFiscalService(DistritoFiscalRepository repo) { this.repo = repo; }

    public List<DistritoFiscal> findAll(){ return repo.findAll(); }
    public Optional<DistritoFiscal> findById(Integer id){ return repo.findById(id); }
    public DistritoFiscal save(DistritoFiscal e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
