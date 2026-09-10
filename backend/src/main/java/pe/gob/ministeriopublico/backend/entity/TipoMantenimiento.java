package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_mantenimiento")
public class TipoMantenimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_tipo_mantenimiento;

    @Column(name = "nombre_tipo", length = 50, nullable = false)
    public String nombre_tipo;

    @Column(length = 250)
    public String descripcion;

    public TipoMantenimiento() {}
}
