package EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.dto;
import jakarta.validation.constraints.NotNull;



public class CategoriaDto {
    @NotNull(message = "EL nombre de categoria obligatorio")
    private String nombreCategoria;

    @NotNull(message = "Descripcion no puede ser un campo vacio" )
    private String descripcion;

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
