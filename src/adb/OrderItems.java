/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adb;

/**
 *
 * @author austine
 */
public class OrderItems {
    private int orderItemID;
    private int orderID;
    private int itemID;
    private int quantity;
    private double cost;

    public OrderItems(int orderItemID, int orderID, int itemID, int quantity, double cost) {
        this.orderItemID = orderItemID;
        this.orderID = orderID;
        this.itemID = itemID;
        this.quantity = quantity;
        this.cost = cost;
    }

    public OrderItems(int orderID, int itemID, int quantity, double cost) {
        this.orderID = orderID;
        this.itemID = itemID;
        this.quantity = quantity;
        this.cost = cost;
    }

    public OrderItems(int itemID, int quantity, double cost) {
        this.itemID = itemID;
        this.quantity = quantity;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "OrderItems{" + "orderItemID=" + orderItemID + ", orderID=" + orderID + ", itemID=" + itemID + ", quantity=" + quantity + ", cost=" + cost + '}';
    }
    

   

    public int getOrderItemID() {
        return orderItemID;
    }

    public int getOrderID() {
        return orderID;
    }

    public int getItemID() {
        return itemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }
}
