package com.projects.study.java.oop.intro;

public abstract class Person {
    long id;
    String sex;
    String name;

    protected Person(long id, String sex, String name) {
        this.id = id;
        this.sex = sex;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
