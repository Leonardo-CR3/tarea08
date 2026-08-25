package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_personal")
public class TipoPersonal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_personal")
    private Long id;

    @Column(name = "nombre_tipo_personal", nullable = false, length = 100)
    private String nombreTipoPersonal;

    @Column(length = 250)
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreTipoPersonal() {
        return nombreTipoPersonal;
    }

    public void setNombreTipoPersonal(String nombreTipoPersonal) {
        this.nombreTipoPersonal = nombreTipoPersonal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
