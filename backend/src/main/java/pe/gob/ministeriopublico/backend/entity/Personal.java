package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "personal")
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_personal")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_personal", nullable = false)
    private TipoPersonal tipoPersonal;

    @Column(length = 8, unique = true)
    private String dni;
    @Column(length = 50)
    private String nombres;
    @Column(name = "apellido_paterno", length = 50)
    private String apellidoPaterno;
    @Column(name = "apellido_materno", length = 50)
    private String apellidoMaterno;
    @Column(length = 120)
    private String correo;
    @Column(length = 20)
    private String telefono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoPersonal getTipoPersonal() {
        return tipoPersonal;
    }

    public void setTipoPersonal(TipoPersonal tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
