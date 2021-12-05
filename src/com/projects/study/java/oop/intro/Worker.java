package com.projects.study.java.oop.intro;

public class Worker extends Employee{
    private boolean isVaccine = false;
    public Worker(long id, String sex, String name, String profession) {
        super(id, sex, name, profession);
    }

    public boolean isVaccine() {
        return isVaccine;
    }

    public void setVaccine(boolean vaccine) {
        isVaccine = vaccine;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "isVaccine=" + isVaccine +
                '}' + super.toString();
    }
}
