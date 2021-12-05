package com.projects.study.java.oop.intro;

public class Employee extends Person{
    private String profession;


    public Employee(long id, String sex, String name, String profession) {
        super(id, sex, name);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "profession='" + profession + '\'' +
                '}' + super.toString();
    }
}
