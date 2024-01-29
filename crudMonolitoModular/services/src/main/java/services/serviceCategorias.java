package services;

import model.Productos;
import model.categorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.categoriaRepository;
import repository.productRpository;

import java.util.List;

@Service
public class serviceCategorias {


    @Autowired
    private categoriaRepository categoriaRepository2;


    public List<categorias> getAllCategorias(){
        return categoriaRepository2.findAll();
    }


    public categorias saveAllcategorias(categorias categorias2){
        return  categoriaRepository2.save(categorias2);
    }
}
