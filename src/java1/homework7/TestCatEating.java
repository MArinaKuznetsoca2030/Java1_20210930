package java1.homework7;

import java.util.Random;


public class TestCatEating {
    private static  Cat[] catsArray;

    public static void main(String[] args) {

        catsArray = new Cat[Cat.COUNT_CAT];

        createCat(Cat.COUNT_CAT); //создаем и заполняем котов

        Plate plate = new Plate(7); // заполняем тарелку

        eatCat(plate, catsArray); // кормим котов

        printCats(catsArray);   // выводим информацию о котах

        plate.info(); // Остаток в тарелке еды

    }

    private static void printCats(Cat[] cats) {
        // выводим информацию о сытости котов после кормления

        for (Cat cat : catsArray) {
            cat.printInfo();
        }
    }

    private static void eatCat(Plate plate, Cat[] cats) {
        // кормим котов

        for (Cat cat : catsArray) {
            cat.eat(plate);
            plate.info();
        }
    }

    private static void createCat(int countCat) {

        // заполняем массив данными
        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i] = setDataCat(i);

            catsArray[i].printInfo();
        }
    }


    private static Cat setDataCat(int i) {

        // заполняем массив данными
        if (i == 0) {
            i++;
        }
        return new Cat(
                "Cat" +i,
                i+rand(Cat.MAX_APPETITE),
                false);

    }

    private static int rand(int max_number) {
        Random rand1 = new Random();
        return rand1.nextInt(max_number);
    }
}

