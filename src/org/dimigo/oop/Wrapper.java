package org.dimigo.oop;

public class Wrapper {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);

        //Boxing
        //1) 생성자
        Integer i1 = new Integer(100); //오토박싱이 되는데 저렇게 생성해서 밑줄그어짐
        Integer i2 = new Integer("100");

        System.out.println(i1.equals(i2));

        //2) valueOf()
        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf("100");
        Double d = Double.valueOf(3.14);

        //Unboxing
        int r1 = i3.intValue();
        double r2 = d.doubleValue();

        //문자열 -> primitive type

        Integer.parseInt("100");
        double b = Double.parseDouble("3.14");



        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[0] + args[1]);

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.println(n1+n2);

        Integer obj1 = 1000; //Autoboxing
        int r3 = obj1 + 100; //AutoUnboxing

        //총 몇번의 autoboxing,autounboxing?
        Integer obj2 = 10;
        Integer obj3 = obj2+20;
        Integer result = obj2+obj3;


    }
}
