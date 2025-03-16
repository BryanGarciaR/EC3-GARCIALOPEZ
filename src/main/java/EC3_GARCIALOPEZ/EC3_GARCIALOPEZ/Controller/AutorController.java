package EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Controller;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.model.Autor;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public ResponseEntity<Autor> crearAutor(@RequestBody Autor autor) {
        Autor nuevoAutor = autorService.crearAutor(autor);
        return new ResponseEntity<>(nuevoAutor, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Autor>> listarAutores() {
        List<Autor> autores = autorService.listarAutores();
        return new ResponseEntity<>(autores, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> obtenerAutorPorId(@PathVariable Integer id) {
        Autor autor = autorService.obtenerAutorPorId(id);
        return new ResponseEntity<>(autor, HttpStatus.OK);
    }
}
