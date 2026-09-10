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

import pe.gob.ministeriopublico.backend.entity.TipoPersonal;
import pe.gob.ministeriopublico.backend.service.TipoPersonalService;

@RestController
@RequestMapping("/api/tipo-personal")
public class TipoPersonalController {

    private final TipoPersonalService service;

    public TipoPersonalController(TipoPersonalService service) {
        this.service = service;
    }

    @GetMapping
    public List<TipoPersonal> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoPersonal> get(@PathVariable Integer id) {
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public TipoPersonal create(@RequestBody TipoPersonal d) {
        return service.save(d);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoPersonal> update(@PathVariable Integer id, @RequestBody TipoPersonal d) {
        return service.findById(id).map(existing -> {
            d.id_tipo_personal = existing.id_tipo_personal;
            return ResponseEntity.ok(service.save(d));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
