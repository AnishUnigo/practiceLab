package com.practice.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record Order(String orderId, BigDecimal totalAmount, LocalDateTime transactionDate, List<Product> products) {

    public Order {
        if (orderId == null || orderId.isBlank()) {
            throw new IllegalArgumentException("Order ID cannot be null or blank");
        }
        if (totalAmount == null || totalAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Total amount must be a positive value");
        }
        if (transactionDate == null) {
            throw new IllegalArgumentException("Transaction date cannot be null");
        }

    }
}
