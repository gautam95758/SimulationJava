
package com.example.simulation.models;

public class Machine {
    private String id;
    private boolean isBusy;

    public Machine(String id) {
        this.id = id;
        this.isBusy = false;
    }

    public String getId() {
        return id;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public void processProduct(Product product) {
        // Simulate processing time and logic
        setBusy(true);
        // Assume processing takes 5 time units
        System.out.println("Processing product " + product.getId() + " on machine " + id);
        setBusy(false);
    }
}
