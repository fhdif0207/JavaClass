package org.dimigo.oop;

public class CcarTest {
    public static void main(String[] args) {
        Ccar h = new Ccar();
        h.setCompany("현대자동차");
        h.setModel("제네시스");
        h.setColor("검정색");
        h.setMaxSpeed(225);
        h.setPrice(50000000);
        Ccar k = new Ccar();
        k.setCompany("기아자동차");
        k.setModel("K7");
        k.setColor("흰색");
        k.setMaxSpeed(246);
        k.setPrice(40000000);
        Ccar s = new Ccar();
        s.setCompany("삼성자동차");
        s.setModel("SM7");
        s.setColor("회색");
        s.setMaxSpeed(200);
        s.setPrice(38000000);
        System.out.println("<< 자동차 목록 >>");
        System.out.println("제조사명 : " + h.getCompany());
        System.out.println("모델명 : " + h.getModel());
        System.out.println("색상 : " + h.getColor());
        System.out.println("최대속도 : " + h.getMaxSpeed() + "km");
        System.out.printf("가격 : %,d원\n",h.getPrice());

        System.out.println("");

        System.out.println("제조사명 : " + k.getCompany());
        System.out.println("모델명 : " + k.getModel());
        System.out.println("색상 : " + k.getColor());
        System.out.println("최대속도 : " + k.getMaxSpeed() + "km");
        System.out.printf("가격 : %,d원\n",k.getPrice());

        System.out.println("");

        System.out.println("제조사명 : " + s.getCompany());
        System.out.println("모델명 : " + s.getModel());
        System.out.println("색상 : " + s.getColor());
        System.out.println("최대속도 : " + s.getMaxSpeed() + "km");
        System.out.printf("가격 : %,d원\n",s.getPrice());
    }
}
