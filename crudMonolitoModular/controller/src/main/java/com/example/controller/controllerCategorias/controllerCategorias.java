package com.example.controller.controllerCategorias;

import model.Productos;
import model.categorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.categoriaRepository;
import services.serviceCategorias;
import services.serviceProduct;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class controllerCategorias {
    @Autowired
    private serviceCategorias serviceCategorias2;




    @GetMapping("/allcategorias")
    public List<categorias> findAll(){
        return serviceCategorias2.getAllCategorias();
    }

    @PostMapping("/savecategorias")
    public categorias addpro (@RequestBody categorias categorias1){
        return serviceCategorias2.saveAllcategorias(categorias1);



    }






}

