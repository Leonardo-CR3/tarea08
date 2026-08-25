package pe.gob.ministeriopublico.backend.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "equipo")
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipo")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_modelo", nullable = false)
    private Modelo modelo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_clasificacion", nullable = false)
    private Clasificacion clasificacion;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_estado_equipo", nullable = false)
    private EstadoEquipo estadoEquipo;

    @Column(name = "codigo_patrimonial", nullable = false, unique = true, length = 50)
    private String codigoPatrimonial;
    @Column(name = "numero_serie", unique = true, length = 100)
    private String numeroSerie;
    @Column(length = 500)
    private String observacion;
    @Column(name = "fecha_adquisicion")
    private LocalDate fechaAdquisicion;
    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public EstadoEquipo getEstadoEquipo() {
        return estadoEquipo;
    }

    public void setEstadoEquipo(EstadoEquipo estadoEquipo) {
        this.estadoEquipo = estadoEquipo;
    }

    public String getCodigoPatrimonial() {
        return codigoPatrimonial;
    }

    public void setCodigoPatrimonial(String codigoPatrimonial) {
        this.codigoPatrimonial = codigoPatrimonial;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
