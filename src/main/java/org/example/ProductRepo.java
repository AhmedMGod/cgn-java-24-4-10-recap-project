package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    private List<Product> products;

    public ProductRepo() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }


}