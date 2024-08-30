package org.example;

import java.util.List;

public class ShopService {
    private final OrderListRepo orderListRepo;

    public ShopService(ProductRepo productRepo, OrderListRepo orderListRepo) {
        this.orderListRepo = orderListRepo;
    }

    public void placeOrder(Order order) {
        orderListRepo.addOrder(order);
    }

    /*public List<Order> getOrders() {
        return orderListRepo.getAllOrders();
    }*/
}
