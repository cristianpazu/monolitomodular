package repository;

import model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRpository extends JpaRepository <Productos, Integer> {
}
