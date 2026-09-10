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

import pe.gob.ministeriopublico.backend.entity.Personal;
import pe.gob.ministeriopublico.backend.service.PersonalService;

@RestController
@RequestMapping("/api/personal")
public class PersonalController {

    private final PersonalService service;

    public PersonalController(PersonalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Personal> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personal> get(@PathVariable Integer id) {
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Personal create(@RequestBody Personal d) {
        return service.save(d);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Personal> update(@PathVariable Integer id, @RequestBody Personal d) {
        return service.findById(id).map(existing -> {
            d.id_personal = existing.id_personal;
            return ResponseEntity.ok(service.save(d));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
