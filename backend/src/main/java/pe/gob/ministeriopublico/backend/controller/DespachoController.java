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

import pe.gob.ministeriopublico.backend.entity.Despacho;
import pe.gob.ministeriopublico.backend.service.DespachoService;

@RestController
@RequestMapping("/api/despachos")
public class DespachoController {

    private final DespachoService service;

    public DespachoController(DespachoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Despacho> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Despacho> get(@PathVariable Integer id) {
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Despacho create(@RequestBody Despacho d) {
        return service.save(d);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Despacho> update(@PathVariable Integer id, @RequestBody Despacho d) {
        return service.findById(id).map(existing -> {
            d.id_despacho = existing.id_despacho;
            return ResponseEntity.ok(service.save(d));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
