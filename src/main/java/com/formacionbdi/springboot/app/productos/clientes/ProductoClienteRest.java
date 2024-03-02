package com.formacionbdi.springboot.app.productos.clientes;

import com.formacionbdi.springboot.app.productos.models.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "servicio-productos", url = "localhost:4250")
public interface ProductoClienteRest {

    @GetMapping("/listar")
    public List<Producto> listar();

    @GetMapping("/listar/{id}")
    public Producto detalle(@PathVariable Long id);

}
