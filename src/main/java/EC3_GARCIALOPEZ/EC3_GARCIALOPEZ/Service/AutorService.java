package EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Service;

import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.exception.ResourceNotFoundException;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.model.Autor;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService  {

    @Autowired
    private AutorRepository autorRepository;

    // Registrar Autor
    public Autor crearAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    // Listar Autores
    public List<Autor> listarAutores() {
        return autorRepository.findAll();
    }

    // Buscar Autor por ID
    public Autor obtenerAutorPorId(Integer id) {
        return autorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Autor no encontrado con id: " + id));
    }
}
