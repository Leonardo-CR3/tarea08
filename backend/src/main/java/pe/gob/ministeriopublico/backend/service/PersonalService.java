package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.entity.Personal;
import pe.gob.ministeriopublico.backend.repository.PersonalRepository;

@Service
public class PersonalService {

    private final PersonalRepository repo;

    public PersonalService(PersonalRepository repo) { this.repo = repo; }

    public List<Personal> findAll(){ return repo.findAll(); }
    public Optional<Personal> findById(Integer id){ return repo.findById(id); }
    public Personal save(Personal e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
