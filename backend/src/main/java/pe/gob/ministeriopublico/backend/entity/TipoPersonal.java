package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_personal")
public class TipoPersonal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_tipo_personal;

    @Column(name = "nombre_tipo_personal", length = 100, nullable = false)
    public String nombre_tipo_personal;

    @Column(length = 250)
    public String descripcion;

    public TipoPersonal() {}
}
