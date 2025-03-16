package EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.Repository;

import EC3_GARCIALOPEZ.EC3_GARCIALOPEZ.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
