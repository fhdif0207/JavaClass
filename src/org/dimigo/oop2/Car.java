package org.dimigo.oop2;

public class Car {
    private String name;
    private static String company;

    public Car() {
        System.out.println("" +
                "Constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Car.company = company;
    }

    @Override
    public String toString() {
        return company+" "+name;
    }
//getter setter tostring
}
