
package com.example.simulation.des;

public class Event implements Comparable<Event> {
    private double time;
    private Runnable action;

    public Event(double time, Runnable action) {
        this.time = time;
        this.action = action;
    }

    public double getTime() {
        return time;
    }

    public void execute() {
        action.run();
    }

    @Override
    public int compareTo(Event other) {
        return Double.compare(this.time, other.time);
    }
}
