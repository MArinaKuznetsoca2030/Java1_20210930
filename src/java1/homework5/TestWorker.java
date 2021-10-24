package java1.homework5;


import java.util.Random;

public class TestWorker {

    private static final int COUNT_WORKER = 5;
    private static final int FIND_AGE = 40;
    private static final int MAX_GRADE = 200000;
    private static final int MAX_AGE = 50;


    public static void main(String[] args) {
        System.out.println("Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.");

        Worker[] workersArray = new Worker[COUNT_WORKER];

        System.out.println("Информация о сотрудниках");

        // заполняем массив данными
        for (int i = 0; i < COUNT_WORKER; i++) {
            workersArray[i] = createWorker(i);

            workersArray[i].printInfo();
        }

        System.out.println("__________________________________________");
        System.out.println("С помощью цикла вывести информацию только о сотрудниках старше 40 лет.");

        int i = 0;
        int count =0;
        do {
            if (workersArray[i].getAge() > FIND_AGE) {
                 workersArray[i].printInfo();
                count++;
            }

            i++;

        } while (i < workersArray.length);

        if (count == 0){
            System.out.println("Сотрудники старше 40 лет отсутствуют");
        }

    }

        private static Worker createWorker(int i) {

            // заполняем массив данными
            return new Worker(
                    "Петров Петр Петрович" +i,
                    "менеджер" + i,
                    "test" +i +"@test.com",
                    "+7701721003" +i,
                     i+rand(MAX_GRADE),
                    i+rand(MAX_AGE));

        }

    private static int rand(int max_number) {
        Random rand1 = new Random();
        return rand1.nextInt(max_number);
    }



}
