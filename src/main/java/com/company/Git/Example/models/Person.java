package com.company.Git.Example.models;

import com.company.Git.Example.controllers.PersonController;

import java.math.BigDecimal;
import java.util.Objects;

public class Person {
    private String name;
    private Integer age;
    private BigDecimal heightInCM;

    public Person(String name, Integer age, BigDecimal heightInCM) {
        this.name = name;
        this.age = age;
        this.heightInCM = heightInCM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getHeightInCM() {
        return heightInCM;
    }

    public void setHeightInCM(BigDecimal heightInCM) {
        this.heightInCM = heightInCM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) && Objects.equals(getAge(), person.getAge()) && Objects.equals(getHeightInCM(), person.getHeightInCM());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHeightInCM());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heightInCM=" + heightInCM +
                '}';
    }
}
