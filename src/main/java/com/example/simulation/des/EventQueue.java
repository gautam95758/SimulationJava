
package com.example.simulation.des;

import java.util.PriorityQueue;

public class EventQueue {
    private PriorityQueue<Event> queue;

    public EventQueue() {
        queue = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        queue.add(event);
    }

    public Event getNextEvent() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
