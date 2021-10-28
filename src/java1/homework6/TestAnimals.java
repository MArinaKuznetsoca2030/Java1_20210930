package java1.homework6;


import java.util.Random;

public class TestAnimals {

    public static void main(String[] args) {
        Cat cat = new Cat("Murka", "white", 2, (rand(Cat.CAT_RUN)), (rand(Cat.CAT_SWIM)), (rand(Cat.CAT_JUMP)));
        Cat cat1 = new Cat("Murzik", "black", 3, 200, 8, 3);
        Dog dog = new Dog("Sharik", "brown", 4, 500, 10, 5);
        Dog dog1 = new Dog("Bobik", "greey", 6, 200, 8, 3);

        int i = 0;
        Animal[] animals = {cat, cat1, dog, dog1};
        for (Animal animal : animals){
            System.out.print(animal);
            System.out.println();
            System.out.println("Достижения " + animal.getName()+ ":");
            animal.run(50);
            animal.swim(150);
            animal.jump(4);
            i=i+1;
        }

        System.out.println("Всего amimals = "+i);
    }

    private static int rand(int max_number) {
        Random rand = new Random();
        return rand.nextInt(max_number);
    }
}
