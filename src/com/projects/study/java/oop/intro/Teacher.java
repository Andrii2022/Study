package com.projects.study.java.oop.intro;

public class Teacher extends Person{
    private double salary;
    public Teacher(long id, String sex, String name, double salary) {
        super(id, sex, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                '}' + super.toString();
    }
}
