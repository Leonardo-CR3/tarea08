package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "despacho")
public class Despacho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_despacho")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_sede", nullable = false)
    private Sede sede;

    @Column(name = "nombre_despacho", nullable = false, length = 250)
    private String nombreDespacho;
    @Column(name = "tipo_proceso", length = 100)
    private String tipoProceso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public String getNombreDespacho() {
        return nombreDespacho;
    }

    public void setNombreDespacho(String nombreDespacho) {
        this.nombreDespacho = nombreDespacho;
    }

    public String getTipoProceso() {
        return tipoProceso;
    }

    public void setTipoProceso(String tipoProceso) {
        this.tipoProceso = tipoProceso;
    }
}
