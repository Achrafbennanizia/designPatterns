package com.factory;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by ship over the sea.");
    }
}
