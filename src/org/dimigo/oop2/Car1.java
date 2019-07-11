package org.dimigo.oop2;

public class Car1 {
    private static String company;
    static{
        company = "현대자동차";
        System.out.println("static block called");
    }
    public Car1(){
        System.out.println("Constructor called");
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Car1.company = company;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(Car.getCompany());
    }
}
