package EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Controller;

import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.dto.CategoriaDto;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.model.Categoria;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<Categoria> crearCategoria(@RequestBody Categoria categoria) {
        Categoria nuevaCategoria = categoriaService.crearCategoria(categoria);
        return new ResponseEntity<>(nuevaCategoria, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listarCategorias(CategoriaDto categoriaDto) {
        List<Categoria> categorias = categoriaService.listarCategorias(categoriaDto);
        return new ResponseEntity<>(categorias, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> obtenerCategoriaPorId(@PathVariable Integer id) {
        Categoria categoria = categoriaService.obtenerCategoriaPorId(id);
        return new ResponseEntity<>(categoria, HttpStatus.OK);
    }
}
