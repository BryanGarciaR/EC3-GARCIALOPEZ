package EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Controller;

import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.model.Libro;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Service.LibroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<Libro> crearLibro(@RequestBody Libro libro) {
        Libro nuevoLibro = libroService.crearLibro(libro);
        return new ResponseEntity<>(nuevoLibro, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Libro>> listarLibros() {
        List<Libro> libros = libroService.listarLibros();
        if (libros.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(libros, HttpStatus.OK);
    }

    @GetMapping("/{libroId}")
    public ResponseEntity<Libro> obtenerLibroPorId(@PathVariable Integer libroId) {
        Libro libro = libroService.obtenerLibroPorId(libroId);
        return new ResponseEntity<>(libro, HttpStatus.OK);
    }
}
