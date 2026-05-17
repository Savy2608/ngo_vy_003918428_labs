/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vyngo
 */
public class Product {
    String names;
    String description;
    String availNum;
    String price;
    Address manufactureAddress;
    Address shippingAddress;
    
    public Product(){
        manufactureAddress = new Address ();
        shippingAddress = new Address ();
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailNum() {
        return availNum;
    }

    public void setAvailNum(String availNum) {
        this.availNum = availNum;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Address getManufactureAddress() {
        return manufactureAddress;
    }

    public void setManufactureAddress(Address manufactureAddress) {
        this.manufactureAddress = manufactureAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    
    
}
