package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.gob.ministeriopublico.backend.model.Usuario;
import pe.gob.ministeriopublico.backend.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) { this.repo = repo; }

    public List<Usuario> findAll(){ return repo.findAll(); }
    public Optional<Usuario> findById(Integer id){ return repo.findById(id); }
    public Usuario save(Usuario e){ return repo.save(e); }
    public void deleteById(Integer id){ repo.deleteById(id); }
}
