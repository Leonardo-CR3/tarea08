package pe.gob.ministeriopublico.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.ministeriopublico.backend.model.UsuarioRol;
import pe.gob.ministeriopublico.backend.service.UsuarioRolService;

@RestController
@RequestMapping("/api/usuarios-roles")
public class UsuarioRolController {

    private final UsuarioRolService service;

    public UsuarioRolController(UsuarioRolService service){ this.service = service; }

    @GetMapping
    public List<UsuarioRol> list(){ return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioRol> get(@PathVariable Integer id){
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public UsuarioRol create(@RequestBody UsuarioRol d){ return service.save(d); }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioRol> update(@PathVariable Integer id, @RequestBody UsuarioRol d){
        return service.findById(id).map(existing -> {
            d.id_usuario_rol = existing.id_usuario_rol;
            return ResponseEntity.ok(service.save(d));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.deleteById(id); return ResponseEntity.noContent().build();
    }
}
