package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.model.UsuarioRol;
import pe.gob.ministeriopublico.backend.repository.UsuarioRolRepository;

@Service
public class UsuarioRolService {

    private final UsuarioRolRepository repo;

    public UsuarioRolService(UsuarioRolRepository repo) { this.repo = repo; }

    public List<UsuarioRol> findAll(){ return repo.findAll(); }
    public Optional<UsuarioRol> findById(Integer id){ return repo.findById(id); }
    public UsuarioRol save(UsuarioRol e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
