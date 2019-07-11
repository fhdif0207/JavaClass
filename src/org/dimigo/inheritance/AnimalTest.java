package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("아무개");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark();
        Dog d = new Dog("멍멍이");
        System.out.println(d);
        d.eat();
        d.sleep();
        d.bark();
        d.wag();
        Cat c = new Cat("야옹이");
        System.out.println(c);
        c.bark();
        c.scratch();
        Tiger t = new Tiger("호돌이");
        System.out.println(t);
        t.bark();
        t.hunt();

        //타입을 일치시키면 얻는 장점: 타입이 같으면 배열로 만들 수 있다, 부모 타입 매개변수를 공통으로 사용가능
        Animal[] animals = {
                new Dog("멍멍이"),
                new Cat("야옹이"),
                new Tiger("호돌이")
        };

        for(Animal animal : animals){
            doBark(animal);
        }

//        Animal a2 = new Dog("야옹이");
//        //a2.scratch();
////        Cat cat = (Cat)a2;
////        cat.scratch();
//        ((Cat) a2).scratch();

        //d: Dog, c: Cat, t:Tiger
        Animal dog = new Dog("멍멍이");
        System.out.println(d instanceof  Dog);
        System.out.println(c instanceof  Cat);
        System.out.println(t instanceof  Tiger);
        System.out.println(dog instanceof  Cat);

    }

    private static void doBark(Animal animal) {
        System.out.println(animal);
        animal.eat();
        animal.sleep();
        animal.bark();
    }
}