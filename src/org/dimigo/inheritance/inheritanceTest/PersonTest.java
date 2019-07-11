package org.dimigo.inheritance.inheritanceTest;

public class PersonTest {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍"),
        };

        for(Person person : persons){
            System.out.println(person);
            greeting(person);
            System.out.println();
        }
    }

    private static void greeting(Person person) {
        person.sayHello();
        person.sayBye();
    }
}
