package com.projects.study.java.oop.intro;

public class Car {
    private long ID;
    private String brand;
    private String model;
    private Double engineVolume;

    public Car() {}

    public Car(long ID){
        this.ID = ID;
    }
    public Car(String brand){
        this.brand = brand;
    }
    public Car(String brand, String model){
        this.model = model;
        this.brand = brand;
    }
    public Car(Double engineVolume){
        this.engineVolume = engineVolume;
    }
    public Car(long ID, String brand, String model, Double engineVolume){
        this.ID = ID;
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public long getId() {
        return ID;
    }
    public String getBrand() {
        return brand;
    }

    public void setId(long ID) {
        this.ID = ID;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public Double getEngineVolume(){
        return engineVolume;
    }
    public void  setModel(String model){
        this.model = model;
    }
    public void setEngineVolume(Double engineVolume){
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
