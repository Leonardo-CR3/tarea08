package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario_rol")
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_usuario_rol;

    @Column(name = "id_usuario", nullable = false)
    public Integer id_usuario;

    @Column(name = "id_rol", nullable = false)
    public Integer id_rol;

    public UsuarioRol() {}
}
