package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "distrito_fiscal")
public class DistritoFiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id_distrito_fiscal;

    @Column(name = "nombre_distrito", length = 150, nullable = false)
    public String nombre_distrito;

    public DistritoFiscal() {
    }
}
