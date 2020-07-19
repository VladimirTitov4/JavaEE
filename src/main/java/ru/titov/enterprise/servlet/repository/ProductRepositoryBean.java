package ru.titov.enterprise.servlet.repository;

import ru.titov.enterprise.servlet.entity.Product;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@ApplicationScoped
public class ProductRepositoryBean implements ProductRepository {

    private final Map<Integer, Product> products = new LinkedHashMap<>();

    @Override
    public Collection<Product> findAll() {
        return products.values();
    }

    @Override
    public Product findById(Integer id) {
        if (!products.containsKey(id)) return null;
        return products.get(id);
    }

    @Override
    public Product addProduct(Product product) {
        if (product == null) return null;
        final Integer id = product.getId();
        products.put(id, product);
        return product;
    }
}
