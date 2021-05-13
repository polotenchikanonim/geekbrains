package com.company.lesson13;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicBoolean;


public class Car implements Runnable {
    private static int CARS_COUNT;
    private final Race race;
    private final int speed;
    private final String name;

    private static final AtomicBoolean isWon = new AtomicBoolean(false);
    private static final CountDownLatch countDownLatchFinish = MainClass.countDownLatchFinish;
    private static final CountDownLatch countDownLatchReady = MainClass.countDownLatchReady;
    private static final CyclicBarrier startBarrier = MainClass.startBarrier;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {

        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            countDownLatchReady.countDown();
            System.out.println(this.name + " готов");
            startBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<Stage> stages = race.getStages();

        for (Stage stage : stages) {
            stage.go(this);
        }

        if (!isWon.getAndSet(true))
            System.out.println(this.name + " - WIN");

        countDownLatchFinish.countDown();
    }
}