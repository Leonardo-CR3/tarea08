package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_mantenimiento")
public class TipoMantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_mantenimiento")
    private Long id;

    @Column(name = "nombre_tipo", nullable = false, length = 50)
    private String nombreTipo;

    @Column(length = 250)
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
