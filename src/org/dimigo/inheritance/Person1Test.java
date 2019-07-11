package org.dimigo.inheritance;

public class Person1Test {
    public static void main(String[] args) {
        Person p = new Person("이원동", 18, 172, 60);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s = new Student("김우주", 18, 160, 160, "2506");
        System.out.println(s);
        s.eat();
        s.sleep();
        s.rollcall();
        s.studyAtNight();

        Teacher t = new Teacher("박성수", 30, 190, 45, "정보통신");
        System.out.println(t);
        t.eat();
        t.sleep();
        t.teach();
        t.doTask();
    }
}
