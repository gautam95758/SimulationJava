
package com.example.simulation.des;

public class SimulationEngine {
    private SimulationClock clock;
    private EventQueue eventQueue;

    public SimulationEngine() {
        clock = new SimulationClock();
        eventQueue = new EventQueue();
    }

    public void scheduleEvent(Event event) {
        eventQueue.addEvent(event);
    }

    public void run() {
        while (!eventQueue.isEmpty()) {
            Event nextEvent = eventQueue.getNextEvent();
            clock.advanceTime(nextEvent.getTime());
            nextEvent.execute();
        }
    }
}
