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
@Table(name = "mantenimiento")
public class Mantenimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_mantenimiento;

    @Column(name = "id_equipo", nullable = false)
    public Integer id_equipo;

    @Column(name = "id_tipo_mantenimiento", nullable = false)
    public Integer id_tipo_mantenimiento;

    @Column(name = "fecha_mantenimiento", nullable = false)
    public LocalDate fecha_mantenimiento;

    @Column(columnDefinition = "TEXT")
    public String diagnostico;

    @Column(columnDefinition = "TEXT")
    public String trabajo_realizado;

    @Column(columnDefinition = "TEXT")
    public String repuesto;

    @Column(name = "responsable_mantenimiento", length = 150)
    public String responsable_mantenimiento;

    @Column(columnDefinition = "TEXT")
    public String observacion;

    @Column(name = "fecha_registro")
    public LocalDateTime fecha_registro;

    public Mantenimiento() {}
}
