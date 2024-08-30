package org.example;

public record Order(int id,
                    String item,
                    int amount,
                    String status) {
}
