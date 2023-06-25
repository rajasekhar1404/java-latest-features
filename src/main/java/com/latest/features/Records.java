package com.latest.features;

import java.util.Objects;


record Product(String id, String name, int quantity) {}

/**
class Product {
    private String id;
    private String name;
    private int quantity;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quantity == product.quantity && Objects.equals(id, product.id) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
 */

public class Records {
    public static void main(String[] args) {
        Product product = new Product("123", "Laptop", 2);
        System.out.println(product);
    }
}
