package EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Service;
import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.dto.CategoriaDto;
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

    public Categoria crearCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> listarCategorias(CategoriaDto categoriaDto) {
        return categoriaRepository.findAll();
    }

    public Categoria obtenerCategoriaPorId(Integer id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Categoría no encontrada con id: " + id));
    }
}
