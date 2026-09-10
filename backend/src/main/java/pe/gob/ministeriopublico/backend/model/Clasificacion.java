package pe.gob.ministeriopublico.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clasificacion")
public class Clasificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_clasificacion;

    @Column(name = "nombre_clasificacion", length = 100, nullable = false)
    public String nombre_clasificacion;

    @Column(length = 250)
    public String descripcion;

    public Clasificacion() {}
}
