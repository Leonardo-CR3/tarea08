package pe.gob.ministeriopublico.backend.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignacion_equipo")
public class AsignacionEquipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_asignacion;

    @Column(name = "id_equipo", nullable = false)
    public Integer id_equipo;

    @Column(name = "id_despacho", nullable = false)
    public Integer id_despacho;

    @Column(name = "id_personal", nullable = false)
    public Integer id_personal;

    @Column(name = "fecha_inicio", nullable = false)
    public LocalDate fecha_inicio;

    @Column(name = "fecha_fin")
    public LocalDate fecha_fin;

    @Column(length = 500)
    public String observacion;

    @Column(name = "fecha_registro")
    public LocalDateTime fecha_registro;

    public AsignacionEquipo() {}
}
