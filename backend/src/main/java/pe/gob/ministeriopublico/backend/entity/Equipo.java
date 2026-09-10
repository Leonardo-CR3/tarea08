package pe.gob.ministeriopublico.backend.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipo")
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_equipo;

    @Column(name = "id_modelo", nullable = false)
    public Integer id_modelo;

    @Column(name = "id_clasificacion", nullable = false)
    public Integer id_clasificacion;

    @Column(name = "id_estado_equipo", nullable = false)
    public Integer id_estado_equipo;

    @Column(name = "codigo_patrimonial", length = 50, nullable = false, unique = true)
    public String codigo_patrimonial;

    @Column(name = "numero_serie", length = 100, unique = true)
    public String numero_serie;

    @Column(length = 500)
    public String observacion;

    @Column(name = "fecha_adquisicion")
    public LocalDate fecha_adquisicion;

    @Column(name = "fecha_registro")
    public LocalDateTime fecha_registro;

    public Equipo() {}
}
