package org.example;

import java.util.List;
import java.util.ArrayList;

public class OrderListRepo implements OrderRepo {
    public List<Order> orderList;

    public OrderListRepo() {
        orderList = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void removeOrder(Order order) {
        orderList.remove(order);
    }

    @Override
    public Order getOrder(int orderId) {
        return null;
    }

    @Override
    public Order[] getAllOrders() {
        return new Order[0];
    }

}
