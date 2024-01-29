package repository;

import model.categorias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoriaRepository extends JpaRepository <categorias, Integer> {
}
