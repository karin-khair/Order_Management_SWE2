package com.example.Order_Management_SWE2.MessageTemplate.shippment;

import com.example.Order_Management_SWE2.MessageTemplate.MessageTemplate;

import com.example.Order_Management_SWE2.order.model.Order;

import java.util.HashMap;

public abstract class ShipmentMessage implements MessageTemplate {
    String Username;
    String msg;
    private HashMap<String, Integer> products;


    public void getThings ( Order order){
        products = (HashMap<String, Integer>) order.getProducts();
        Username = order.getUsername();

    }
    public String getUsername(){
        return Username;
    }
    public HashMap<String, Integer> getProducts(){
        return   products;
    }
    public abstract String SendM(Order order);
}
