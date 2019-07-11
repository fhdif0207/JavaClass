package org.dimigo.inheritance;

public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone i = new IPhone("iPhone XS", "애플", 1370000);
        SmartPhone g = new Galaxy("갤럭시 S10", "삼성", 1500000);

        System.out.println(i);
        i.turnOn();
        i.pay();
        i.useSpecialFunction();
        i.turnOff();
        System.out.println();
        System.out.println(g);
        g.turnOn();
        g.pay();
        g.useSpecialFunction();
        g.turnOff();
    }
}