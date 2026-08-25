package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clasificacion")
public class Clasificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clasificacion")
    private Long id;

    @Column(name = "nombre_clasificacion", nullable = false, length = 100)
    private String nombreClasificacion;

    @Column(length = 250)
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreClasificacion() {
        return nombreClasificacion;
    }

    public void setNombreClasificacion(String nombreClasificacion) {
        this.nombreClasificacion = nombreClasificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
