package java1.homework5;

public class TestWorker {
    public static void main(String[] args) {
        System.out.println("Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.");
        Worker worker1 = new Worker("Петров Петр Петрович","менеджер", "test@test.com", "7017210039", 180000, 35);
        worker1.info();

        Worker[] workersArray = new Worker[5]; // Вначале объявляем массив объектов
        workersArray[0] = new Worker("Иванов Иван Иванович","менеджер", "test@test.com", "7017210030", 180000, 44);
        workersArray[1] = new Worker("Иванов Иван Петрович","директор", "test1@test.com", "7017210031", 180000, 20);
        workersArray[2] = new Worker("Иванов Иван Васильевич","уборщик", "test2@test.com", "7017210032", 180000, 45);
        workersArray[3] = new Worker("Иванов Иван Аркадьевич","маркетолог", "test3@test.com", "7017210033", 180000, 29);
        workersArray[4] = new Worker("Иванов Иван Юрьевич","аналитик", "test4@test.com", "7017210034", 180000, 40);

        System.out.println("С помощью цикла вывести информацию только о сотрудниках старше 40 лет.");

        int i = 0;
        int count =0;
        do {
            if (workersArray[i].age > 40) {
                workersArray[i].info();
                count++;
            }

            i++;

        } while (i < workersArray.length);

        if (count == 0){
            System.out.println("Сотрудники старше 40 лет отсутствуют");
        }


    }


}
