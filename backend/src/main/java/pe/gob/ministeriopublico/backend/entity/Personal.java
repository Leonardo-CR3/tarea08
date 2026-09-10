package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "personal")
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_personal;

    @Column(name = "id_tipo_personal", nullable = false)
    public Integer id_tipo_personal;

    @Column(length = 8, unique = true)
    public String dni;

    @Column(length = 50)
    public String nombres;

    @Column(length = 50)
    public String apellido_paterno;

    @Column(length = 50)
    public String apellido_materno;

    @Column(length = 120)
    public String correo;

    @Column(length = 20)
    public String telefono;

    public Personal() {}
}
