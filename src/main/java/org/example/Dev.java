package org.example;

public class Dev {

    private int age;

    public Dev(){
        System.out.println("Dev constructor");
    }

    public Dev(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build(){
        System.out.println("Dev build something");
    }
}
