package com.example.authserver;

import org.junit.jupiter.api.Test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class CyclicTest {

    @Test
    public void testCyclicBarriar() {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10, () ->
                System.out.println("to the end"));
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (; atomicInteger.get() < 10; atomicInteger.incrementAndGet()) {
            final int current = atomicInteger.get();
            new Thread(() -> {
                try {
                    System.out.println("Thread " + current + "strated!");
                    Thread.sleep(1000);
                    System.out.println("Thread " + current + "after sleep!");
                    cyclicBarrier.await();
                    System.out.println("Thread " + current + "wake up!");
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    public static void main(String[] args) {
        new CyclicTest().testCyclicBarriar();
    }
}
