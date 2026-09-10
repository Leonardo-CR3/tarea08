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

import pe.gob.ministeriopublico.backend.model.Clasificacion;
import pe.gob.ministeriopublico.backend.service.ClasificacionService;

@RestController
@RequestMapping("/api/clasificaciones")
public class ClasificacionController {

    private final ClasificacionService service;

    public ClasificacionController(ClasificacionService service){ this.service = service; }

    @GetMapping
    public List<Clasificacion> list(){ return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Clasificacion> get(@PathVariable Integer id){
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Clasificacion create(@RequestBody Clasificacion d){ return service.save(d); }

    @PutMapping("/{id}")
    public ResponseEntity<Clasificacion> update(@PathVariable Integer id, @RequestBody Clasificacion d){
        return service.findById(id).map(existing -> {
            d.id_clasificacion = existing.id_clasificacion;
            return ResponseEntity.ok(service.save(d));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.deleteById(id); return ResponseEntity.noContent().build();
    }
}
