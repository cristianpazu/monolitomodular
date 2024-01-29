package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Entity
@Data
@NoArgsConstructor
public class Productos {
    @Id
    private int id;


    private String nombreProducto;

    private int precioProducto;
   @OneToOne
    private categorias categria2;

}
