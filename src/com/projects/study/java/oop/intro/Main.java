package com.projects.study.java.oop.intro;

public class Main {
    public static void main(String[] args) {
       /* Car car = new Car();
        car.setId(1L);
        car.setModel("Polo");
        car.setBrand("Kia");
        car.setEngineVolume(1.8);
        System.out.println("first constructor : ");

        System.out.println(car.toString());

        System.out.println("second constructor with brand : ");

        Car car1 = new Car("Kia");
        car1.setEngineVolume(5.7);
        car1.setModel("Polo");
        car1.setId(1L);
        System.out.println(car1.toString());

        System.out.println("full constructor : ");

        Car car2 = new Car(1L, "kia", "Polo", 1.6);

        System.out.println(car2.toString());*/


        /*Person employee = new Employee(1L, "male", "Jonh", "Driver");

        System.out.println(employee);

        Person teacher = new Teacher(5L, "female", "Jane", 5600.94);

        System.out.println(teacher);
        */

        Person security = new Employee(1L, "male", "John Doe", "security");
        Worker worker = new Worker(34L, "female", "Jane", "baker");

        System.out.println("Welcome in cityHall, show your certificate please...");
        if (worker.isVaccine()) {
            System.out.println("OK, please come in have a nice day");
        } else {
            System.out.println("I`m sorry, you need be vaccinated");
        }

        worker.setVaccine(true);

        if (worker.isVaccine()) {
            System.out.println("OK, please come in have a nice day");
        } else {
            System.out.println("I`m sorry, you need be vaccinated");
        }




    }


}
