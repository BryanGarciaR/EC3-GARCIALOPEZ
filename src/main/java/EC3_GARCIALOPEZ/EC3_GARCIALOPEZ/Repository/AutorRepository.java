package EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Repository;

import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
}
