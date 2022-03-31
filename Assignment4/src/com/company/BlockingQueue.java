package com.company;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue<E> {
    private List<E> queue = new LinkedList<>();
    private int capacity = 10;
    public BlockingQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void add(E item)
        throws InterruptedException
    {
        while (this.queue.size() == this.capacity) {
            wait();
        }
        if (this.queue.size() == 0) {
            notifyAll();
        }
        this.queue.add(item);
    }

    public synchronized E remove()
        throws InterruptedException
    {
        while (this.queue.size() == 0) {
            wait();
        }
        if (this.queue.size() == this.capacity) {
            notifyAll();
        }
        return this.queue.remove(0);
    }

    public synchronized E peek()
        throws InterruptedException
    {
        while (this.queue.size() == 0) {
            wait();
        }
        return this.queue.get(0);
    }

    public synchronized boolean isEmpty() {
        return queue.isEmpty();
    }
}
