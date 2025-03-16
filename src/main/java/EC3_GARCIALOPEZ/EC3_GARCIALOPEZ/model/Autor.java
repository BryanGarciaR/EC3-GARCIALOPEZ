package EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Autores")

public class Autor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AutorID")
    private Integer id;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "Apellido", nullable = false, length = 100)
    private String apellido;

    public Autor() {
    }

    public Autor(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
