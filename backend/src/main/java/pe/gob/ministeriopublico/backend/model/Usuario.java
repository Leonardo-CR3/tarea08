package pe.gob.ministeriopublico.backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_usuario;

    @Column(name = "usuario", length = 50, nullable = false, unique = true)
    public String usuario;

    @Column(name = "contrasena", length = 255, nullable = false)
    public String contrasena;

    @Column(name = "nombre_completo", length = 150, nullable = false)
    public String nombre_completo;

    @Column(name = "correo_electronico", length = 150)
    public String correo_electronico;

    @Column(length = 20)
    public String estado = "ACTIVO";

    @Column(name = "fecha_creacion")
    public LocalDateTime fecha_creacion;

    public Usuario() {}
}
