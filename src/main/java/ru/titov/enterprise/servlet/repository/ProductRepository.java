package ru.titov.enterprise.servlet.repository;

import ru.titov.enterprise.servlet.entity.Product;

import java.util.Collection;

public interface ProductRepository {

    Collection<Product> findAll();

    Product findById(String id);

    Product addProduct(Product product);
}