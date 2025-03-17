package EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Service;

import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.exception.ResourceNotFoundException;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.model.Autor;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.model.Categoria;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.model.Libro;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Repository.AutorRepository;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Repository.CategoriaRepository;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    private final LibroRepository libroRepository;
    private final AutorRepository autorRepository;
    private final CategoriaRepository categoriaRepository;

    @Autowired
    public LibroService(LibroRepository libroRepository, AutorRepository autorRepository, CategoriaRepository categoriaRepository) {
        this.libroRepository = libroRepository;
        this.autorRepository = autorRepository;
        this.categoriaRepository = categoriaRepository;
    }

    public Libro crearLibro(Libro libro) {
        // Verificar que el autor existe
        Autor autor = autorRepository.findById(libro.getAutor().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Autor no encontrado con id: " + libro.getAutor().getId()));

        // Verificar que la categoría existe
        Categoria categoria = categoriaRepository.findById(Math.toIntExact(libro.getCategoria().getId()))
                .orElseThrow(() -> new ResourceNotFoundException("Categoría no encontrada con id: " + libro.getCategoria().getId()));

        // Asignar el autor y la categoría encontrados
        libro.setAutor(autor);
        libro.setCategoria(categoria);

        return libroRepository.save(libro);
    }

    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }

    public Libro obtenerLibroPorId(Integer id) {
        return libroRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Libro no encontrado con id: " + id));
    }
}
