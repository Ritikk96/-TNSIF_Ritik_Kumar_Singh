package com.tnsif.day5.Abstraction;

abstract class Car {
    abstract void accelerate();

    void brake() {
        System.out.println("The car is braking");
    }
}

class Sedan extends Car {
    @Override
    void accelerate() {
        System.out.println("Sedan is accelerating");
    }
}

class SUV extends Car {
    @Override
    void accelerate() {
        System.out.println("SUV is accelerating");
    }
}

public class Main {
    public static void main(String[] args) {
        Car mySedan = new Sedan();
        Car mySUV = new SUV();

        mySedan.accelerate();
        mySedan.brake();

        mySUV.accelerate();
        mySUV.brake();
    }
}

