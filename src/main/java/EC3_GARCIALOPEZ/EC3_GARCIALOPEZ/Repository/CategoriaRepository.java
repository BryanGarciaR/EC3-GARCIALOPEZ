package EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Repository;

import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
