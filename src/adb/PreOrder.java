/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adb;

import java.util.Date;

/**
 *
 * @author austine
 */
public class PreOrder {
     private int preOrderID;
   private Date preOrderDate;
   private int customerID;
   private Date collectionDate;
   private int staffID;
   private int itemID;
   private int quantity;
   private double cost;

   public PreOrder(int preOrderID, Date preOrderDate, int customerID, Date collectionDate, int staffID, int itemID, int quantity, double cost) {
      this.preOrderID = preOrderID;
      this.preOrderDate = preOrderDate;
      this.customerID = customerID;
      this.collectionDate = collectionDate;
      this.staffID = staffID;
      this.itemID = itemID;
      this.quantity = quantity;
      this.cost = cost;
   }

    public PreOrder(int itemID, int quantity, double cost) {
        this.itemID = itemID;
        this.quantity = quantity;
        this.cost = cost;
    }

    public PreOrder(Date preOrderDate, int customerID, Date collectionDate, int staffID) {
        this.preOrderDate = preOrderDate;
        this.customerID = customerID;
        this.collectionDate = collectionDate;
        this.staffID = staffID;
    }

   public int getPreOrderID() {
      return preOrderID;
   }

   public void setPreOrderID(int preOrderID) {
      this.preOrderID = preOrderID;
   }

   public Date getPreOrderDate() {
      return preOrderDate;
   }

   public void setPreOrderDate(Date preOrderDate) {
      this.preOrderDate = preOrderDate;
   }

   public int getCustomerID() {
      return customerID;
   }

   public void setCustomerID(int customerID) {
      this.customerID = customerID;
   }

   public Date getCollectionDate() {
      return collectionDate;
   }

   public void setCollectionDate(Date collectionDate) {
      this.collectionDate = collectionDate;
   }

   public int getStaffID() {
      return staffID;
   }

   public void setStaffID(int staffID) {
      this.staffID = staffID;
   }

   public int getItem() {
      return itemID;
   }

   public void setItem(int item) {
      this.itemID = itemID;
   }

   public int getQuantity() {
      return quantity;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   public double getCost() {
      return cost;
   }

   public void setCost(double cost) {
      this.cost = cost;
   }
    
}
