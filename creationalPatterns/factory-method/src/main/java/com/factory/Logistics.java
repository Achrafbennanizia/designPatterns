package com.factory;

public abstract class Logistics {

    // Factory Method
    public abstract Transport createTransport();

    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }
}
