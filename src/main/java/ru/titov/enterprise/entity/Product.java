package ru.titov.enterprise.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.Nullable;

@Getter
@Setter
@NoArgsConstructor
public class Product extends AbstractEntity {

    @Nullable
    private String name = "";

    @Nullable
    private String description = "";

    public Product(@Nullable final String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
