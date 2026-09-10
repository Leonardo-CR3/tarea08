package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estado_equipo")
public class EstadoEquipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_estado_equipo;

    @Column(name = "nombre_estado", length = 50, nullable = false)
    public String nombre_estado;

    @Column(length = 250)
    public String descripcion;

    public EstadoEquipo() {}
}
