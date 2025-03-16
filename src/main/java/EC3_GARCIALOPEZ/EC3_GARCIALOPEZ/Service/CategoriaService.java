package EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Service;

import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.exception.ResourceNotFoundException;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.model.Categoria;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    // Método para registrar o crear una nueva categoría
    public Categoria crearCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // Método para listar todas las categorías
    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    // Método para buscar una categoría por ID
    public Categoria obtenerCategoriaPorId(Integer id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Categoría no encontrada con id: " + id));
    }
}
