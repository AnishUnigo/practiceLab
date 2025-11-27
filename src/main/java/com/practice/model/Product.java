package com.practice.model;

public record Product(String productId,
                      String name,
                      String category,
                      int quantity,
                      boolean inStock,
                      double price) {

    public Product {
        if (productId == null || productId.isBlank()) {
            throw new IllegalArgumentException("Product ID cannot be null or blank");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Product name cannot be null or blank");
        }
        if (category == null || category.isBlank()) {
            throw new IllegalArgumentException("Product category cannot be null or blank");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }
}
