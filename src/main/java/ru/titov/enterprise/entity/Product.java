package ru.titov.enterprise.entity;


public class Product {

    private static int id;

    private String name;
    private String description;

    public Product(String name) {
        this.name = name;
        id++;
    }

    public Product() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
