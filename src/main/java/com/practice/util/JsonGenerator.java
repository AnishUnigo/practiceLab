package com.practice.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.practice.model.Order;
import com.practice.model.Product;

import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class JsonGenerator {

    public static void main(String[] args) {
        try {
            List<Order> orders = new ArrayList<>();

            // Generate 100 orders
            for (int i = 1; i <= 100; i++) {
                String orderId = UUID.randomUUID().toString();
                BigDecimal totalAmount = BigDecimal.valueOf(Math.random() * 1000).setScale(2, BigDecimal.ROUND_HALF_UP);
                LocalDateTime transactionDate = LocalDateTime.now().minusDays((long) (Math.random() * 30));

                // Generate random products for each order
                List<Product> products = new ArrayList<>();
                for (int j = 1; j <= (int) (Math.random() * 5) + 1; j++) {
                    products.add(new Product(
                            "P" + String.format("%03d", (int) (Math.random() * 100) + 1),
                            getRandomProductName(j),
                            getRandomCategory(),
                            (int) (Math.random() * 50),
                            Math.random() > 0.5,
                            Math.random() * 100
                    ));
                }

                orders.add(new Order(orderId, totalAmount, transactionDate, products));
            }

            // Serialize orders to JSON
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new com.fasterxml.jackson.datatype.jsr310.JavaTimeModule());
            mapper.disable(com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
            writer.writeValue(new File("orders.json"), orders);

            System.out.println("JSON file 'orders.json' generated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Generates a random product name based on the index.
     *
     * @param index The index of the product.
     * @return A random product name.
     */
    private static String getRandomProductName(int index) {
        String[] productNames = {
                "Apple iPhone 15", "Samsung Galaxy S24", "Sony WH-1000XM5 Headphones",
                "Dell XPS 13 Laptop", "Apple MacBook Pro", "Logitech MX Master 3 Mouse",
                "Amazon Echo Dot", "Google Nest Hub", "Canon EOS R6 Camera",
                "Nintendo Switch", "Fitbit Charge 5", "Bose QuietComfort Earbuds"
        };
        return productNames[(int)(Math.random() * productNames.length)];
    }

    /**
     * Returns a random category from a predefined list.
     *
     * @return A random category.
     */
    private static String getRandomCategory() {
        String[] categories = {"Electronics", "Home Appliances", "Books", "Clothing", "Toys"};
        return categories[(int)(Math.random() * categories.length)];
    }
}