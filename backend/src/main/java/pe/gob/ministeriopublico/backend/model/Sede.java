package pe.gob.ministeriopublico.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sede")
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_sede;

    @Column(name = "id_distrito_fiscal", nullable = false)
    public Integer id_distrito_fiscal;

    @Column(name = "nombre_sede", length = 150, nullable = false)
    public String nombre_sede;

    @Column(length = 300)
    public String direccion;

    public Sede() {}
}
