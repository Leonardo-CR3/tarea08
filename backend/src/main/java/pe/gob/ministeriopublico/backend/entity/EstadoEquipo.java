package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estado_equipo")
public class EstadoEquipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_equipo")
    private Long id;

    @Column(name = "nombre_estado", nullable = false, length = 50)
    private String nombreEstado;

    @Column(length = 250)
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
