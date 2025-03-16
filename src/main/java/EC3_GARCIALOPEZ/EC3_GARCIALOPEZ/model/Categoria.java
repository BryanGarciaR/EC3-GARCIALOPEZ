package EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.model;


import jakarta.persistence.*;


@Entity
@Table (name = "Categorías")

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoriaID")
    private Integer id;

    @Column(name = "NombreCategoria", nullable = false, length = 50)
    private String nombreCategoria;

    @Column(name = "Descripción")
    private String descripcion;

    public Categoria() {
    }

    public Categoria(Integer id, String nombreCategoria, String descripcion) {
        this.id = id;
        this.nombreCategoria = nombreCategoria;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
