package org.dimigo.interfaces;

public class AnimalTest {
    public static void main(String[] args) {
        //IAnimal.FARM_NAME = "디미 동물농장2";
        IAnimal[] animals = {
                new Dog(), new Cat()
        };

        for(IAnimal a : animals){
            a.eat();
            a.sleep();
            a.bark();
            //wag() 호출하려면?
            if(a instanceof Dog) {
                ((Dog) a).wag();
            }
        }
    }
}
