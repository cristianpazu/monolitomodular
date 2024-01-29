package com.example.controller.controllerProduct;


import model.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.serviceProduct;

import java.util.List;

@RestController
@RequestMapping ("/productos")
public class controllerProduct {

    @Autowired
    private serviceProduct serviceProduct2;




    @GetMapping("/allProductos")
    public List<Productos> findAll(){
        return serviceProduct2.getAllProduct();
    }

    @PostMapping("/saveProductos")
    public Productos addpro (@RequestBody Productos productos){
        return serviceProduct2.saveAllProductor(productos);



    }






}
