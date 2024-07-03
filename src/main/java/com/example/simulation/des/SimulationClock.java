
package com.example.simulation.des;

public class SimulationClock {
    private double currentTime;

    public SimulationClock() {
        this.currentTime = 0.0;
    }

    public double getCurrentTime() {
        return currentTime;
    }

    public void advanceTime(double time) {
        currentTime = time;
    }
}
