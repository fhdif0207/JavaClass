package org.dimigo.abstractclass;

public class CarTest {
    public static void main(String[] args) {
        Car car =  new Car();
        car.setEngine(new BenzEngine());
        car.start();
        car.stop();
        car.setEngine(new BMWEngine());
        car.start();
        car.stop();
    }
}