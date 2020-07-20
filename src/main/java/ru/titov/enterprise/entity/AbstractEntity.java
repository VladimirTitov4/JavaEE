package ru.titov.enterprise.entity;

import lombok.Data;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@Data
public class AbstractEntity {

    @Nullable
    protected String id = UUID.randomUUID().toString();
}
