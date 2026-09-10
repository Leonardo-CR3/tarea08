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

import pe.gob.ministeriopublico.backend.model.DistritoFiscal;
import pe.gob.ministeriopublico.backend.service.DistritoFiscalService;

@RestController
@RequestMapping("/api/distritos")
public class DistritoFiscalController {

    private final DistritoFiscalService service;

    public DistritoFiscalController(DistritoFiscalService service){ this.service = service; }

    @GetMapping
    public List<DistritoFiscal> list(){ return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<DistritoFiscal> get(@PathVariable Integer id){
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public DistritoFiscal create(@RequestBody DistritoFiscal d){ return service.save(d); }

    @PutMapping("/{id}")
    public ResponseEntity<DistritoFiscal> update(@PathVariable Integer id, @RequestBody DistritoFiscal d){
        return service.findById(id).map(existing -> {
            d.id_distrito_fiscal = existing.id_distrito_fiscal;
            return ResponseEntity.ok(service.save(d));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.deleteById(id); return ResponseEntity.noContent().build();
    }
}
