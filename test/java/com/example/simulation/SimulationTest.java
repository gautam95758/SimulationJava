
package com.example.simulation;

import com.example.simulation.des.*;
import com.example.simulation.models.*;

public class SimulationTest {
    public static void main(String[] args) {
        SimulationEngine engine = new SimulationEngine();
        Machine machine1 = new Machine("Machine1");
        Machine machine2 = new Machine("Machine2");
        Conveyor conveyor = new Conveyor("Conveyor1");
        Product product1 = new Product("Product1");

        engine.scheduleEvent(new Event(0, () -> conveyor.transportProduct(product1, machine1)));
        engine.scheduleEvent(new Event(5, () -> machine1.processProduct(product1)));
        engine.scheduleEvent(new Event(10, () -> conveyor.transportProduct(product1, machine2)));
        engine.scheduleEvent(new Event(15, () -> machine2.processProduct(product1)));

        engine.run();
    }
}
