package org.example;

public class Main {

    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(new Product(456, "Shirt", 25.15, "Esprit"));
        productRepo.addProduct(new Product(654, "Pullover", 35.15, "WE"));



    }
}