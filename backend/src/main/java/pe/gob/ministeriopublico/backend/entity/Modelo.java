package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "modelo")
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_modelo;

    @Column(name = "id_marca", nullable = false)
    public Integer id_marca;

    @Column(name = "nombre_modelo", length = 150, nullable = false)
    public String nombre_modelo;

    @Column(length = 250)
    public String descripcion;

    public Modelo() {}
}
