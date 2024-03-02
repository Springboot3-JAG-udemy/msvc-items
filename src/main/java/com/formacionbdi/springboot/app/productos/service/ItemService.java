package com.formacionbdi.springboot.app.productos.service;

import com.formacionbdi.springboot.app.productos.models.Item;

import java.util.List;

public interface ItemService {
    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);
}
