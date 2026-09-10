package pe.gob.ministeriopublico.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_rol;

    @Column(name = "nombre_rol", length = 50, nullable = false)
    public String nombre_rol;

    public Rol() {}
}
