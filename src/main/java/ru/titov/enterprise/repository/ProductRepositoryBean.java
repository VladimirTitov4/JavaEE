package ru.titov.enterprise.repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.titov.enterprise.entity.Product;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.*;

@ApplicationScoped
public class ProductRepositoryBean implements ProductRepository {

    @NotNull
    private Map<String, Product> products = new LinkedHashMap<>();

    @PostConstruct
    private void init() {
        System.out.println("postConstruct is here");
        addProduct(new Product("product1"));
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

    @Nullable
    public Product addProduct(@Nullable Product product) {
        if (product == null) return null;
        @Nullable final String id = product.getId();
        if (id == null || id.isEmpty()) return null;
        products.put(id, product);

        return product;
    }
}
