
package com.example.simulation.models;

public class Conveyor {
    private String id;

    public Conveyor(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void transportProduct(Product product, Machine destination) {
        // Simulate transportation logic
        System.out.println("Transporting product " + product.getId() + " to machine " + destination.getId());
        destination.processProduct(product);
    }
}
