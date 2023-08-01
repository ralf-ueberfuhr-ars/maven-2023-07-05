package de.ars.schulung.maven;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car = Car.builder()
                .type("Ford")
                .year(2010)
                .build();
        System.out.println(car.getType());
    }
}