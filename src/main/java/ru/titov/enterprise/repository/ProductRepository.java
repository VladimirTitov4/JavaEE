package ru.titov.enterprise.repository;

import ru.titov.enterprise.entity.Product;

import java.util.Collection;

public interface ProductRepository {

    Collection<Product> findAll();

    Product findById(Integer id);

    Product addProduct(Product product);
}
