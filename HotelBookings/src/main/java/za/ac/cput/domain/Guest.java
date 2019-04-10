package za.ac.cput.domain;

import javafx.util.Builder;

public class Guest {
    private String name;
    private String surname;
    private int age;

    public Guest() {
    }
    private Guest(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

public static class Builder{
    private String name;
    private String surname;
    private int age;

    public Builder name(String name){
        this.name = name;
        return this;
    }
    public Builder surname(String surname){
        this.surname = surname;
        return this;
    }
    public Builder age(int age){
        this.age = age;
        return this;
    }

    public Guest build() {
        return new Guest(this);
    }
}
}
