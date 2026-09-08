package org.example;

public class Dev {

    private Laptop laptop;
    private int age;

    public Dev(){
        System.out.println("Dev constructor");
    }

    public Dev(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build(){
        System.out.println("Dev build something");
        laptop.compile();
    }
}
