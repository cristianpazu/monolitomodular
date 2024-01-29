package services;

import model.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.productRpository;

import java.util.List;

@Service
public class serviceProduct {

    @Autowired
    private productRpository productRpository2;


    public List <Productos> getAllProduct(){
        return productRpository2.findAll();
    }


    public Productos saveAllProductor(Productos productos){
        return  productRpository2.save(productos);
    }
}
