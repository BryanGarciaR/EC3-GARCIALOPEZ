package EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Service;


import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.exception.ResourceNotFoundException;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.model.Libro;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public Libro crearLibro(Libro libro) {
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
