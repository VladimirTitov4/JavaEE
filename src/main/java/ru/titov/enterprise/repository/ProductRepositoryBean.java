package ru.titov.enterprise.repository;

import org.jetbrains.annotations.NotNull;
import ru.titov.enterprise.entity.Product;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@ApplicationScoped
public class ProductRepositoryBean implements ProductRepository {

    @NotNull
    private final Map<Integer, Product> products = new LinkedHashMap<>();

    @PostConstruct
    private void init() {
        addProduct(new Product("product1"));
    }

    {
        products.put(0, new Product("product2"));
        addProduct(new Product("product2"));
    }

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

        products.put(1, product);
        return product;
    }
}
