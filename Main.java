package org.example;

import org.example.models.Customer;
import org.example.models.Item;
import org.example.models.ItemOrder;
import org.example.models.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Burger", 5);
        Item item2 = new Item("Fries", 2);

        // Create item orders
        ItemOrder itemOrder1 = new ItemOrder(item1, 2);
        ItemOrder itemOrder2 = new ItemOrder(item2, 1);

        // Create a list of item orders
        List<ItemOrder> itemOrderList = new ArrayList<>();
        itemOrderList.add(itemOrder1);
        itemOrderList.add(itemOrder2);

        // Create an order
        Order order = new Order(1, itemOrderList);

        // Create a customer
        Customer customer = new Customer("John Doe", 50);

        // Set the order list for the customer
        List<Order> orderList = new ArrayList<>();
        orderList.add(order);
        customer.setOrderList(orderList);

        // Print customer details and order information
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Balance: $" + customer.getBalance());

        for (Order customerOrder : customer.getOrderList()) {
            System.out.println("\nOrder ID: " + customerOrder.getOrderId());
            System.out.println("Order Date: " + customerOrder.getDate());

            for (ItemOrder itemOrder : customerOrder.getItemOrderList()) {
                System.out.println("Item: " + itemOrder.getItem().getName());
                System.out.println("Quantity: " + itemOrder.getQuantity());
            }
        }
    }
}
