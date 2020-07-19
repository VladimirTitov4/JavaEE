package ru.titov.enterprise.servlet.repository;

import ru.titov.enterprise.servlet.entity.Product;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@ApplicationScoped
public class ProductRepositoryBean implements ProductRepository {

    private Map<String, Product> products = new LinkedHashMap<>();

    @Override
    public Collection<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(String id) {
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }
}
