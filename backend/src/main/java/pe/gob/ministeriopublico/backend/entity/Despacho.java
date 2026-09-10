package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "despacho")
public class Despacho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_despacho;

    @Column(name = "id_sede", nullable = false)
    public Integer id_sede;

    @Column(name = "nombre_despacho", length = 250, nullable = false)
    public String nombre_despacho;

    @Column(name = "tipo_proceso", length = 100)
    public String tipo_proceso;

    public Despacho() {
    }
}
