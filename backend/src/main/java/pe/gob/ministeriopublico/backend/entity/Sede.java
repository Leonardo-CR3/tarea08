package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sede")
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sede")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_distrito_fiscal", nullable = false)
    private DistritoFiscal distritoFiscal;

    @Column(name = "nombre_sede", nullable = false, length = 150)
    private String nombreSede;

    @Column(length = 300)
    private String direccion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DistritoFiscal getDistritoFiscal() {
        return distritoFiscal;
    }

    public void setDistritoFiscal(DistritoFiscal distritoFiscal) {
        this.distritoFiscal = distritoFiscal;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
