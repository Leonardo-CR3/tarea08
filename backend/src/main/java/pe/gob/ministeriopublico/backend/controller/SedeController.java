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

import pe.gob.ministeriopublico.backend.model.Sede;
import pe.gob.ministeriopublico.backend.service.SedeService;

@RestController
@RequestMapping("/api/sedes")
public class SedeController {

    private final SedeService service;

    public SedeController(SedeService service){ this.service = service; }

    @GetMapping
    public List<Sede> list(){ return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Sede> get(@PathVariable Integer id){
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Sede create(@RequestBody Sede d){ return service.save(d); }

    @PutMapping("/{id}")
    public ResponseEntity<Sede> update(@PathVariable Integer id, @RequestBody Sede d){
        return service.findById(id).map(existing -> {
            d.id_sede = existing.id_sede;
            return ResponseEntity.ok(service.save(d));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.deleteById(id); return ResponseEntity.noContent().build();
    }
}
