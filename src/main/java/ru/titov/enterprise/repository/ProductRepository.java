package ru.titov.enterprise.repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.titov.enterprise.entity.Product;

import java.util.Collection;

public interface ProductRepository {

    @NotNull
    Collection<Product> findAll();

    @Nullable
    Product findById(@Nullable String id);

    @Nullable
    Product addProduct(@Nullable Product product);
}
