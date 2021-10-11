package java1.homework2;

public class HomeWorkAppLesson2 {
    public static void main(String[] args) {

        System.out.println(checkSumNumber(5,-8));
        printNumberIsNegative(7891);
        System.out.println(checkNumberIsNegative(-9));
        printStringRepeatedly("Java 1. Base level", 4);
        System.out.println(checkYear(2020));
    }


    private static boolean checkSumNumber(int numberX, int numberY) {
        // Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
        // от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        int sum = numberX + numberY;
        return (sum >= 10 && sum <= 20);

    }

    private static void printNumberIsNegative(int number){
        // Написать метод, которому в качестве параметра передается целое число, метод должен
        // напечатать в консоль, положительное ли число передали или отрицательное.
        // Замечание: ноль считаем положительным числом.

            if (number < 0) {System.out.println(number + " - "+ "Negative number");
            } else {System.out.println(number + " - "+ "Positive number");
            }
    }

    private static boolean checkNumberIsNegative (int numberInt) {
        // Написать метод, которому в качестве параметра передается целое число. Метод
        // должен вернуть true, если число отрицательное, и вернуть false если положительное.
        return  (numberInt < 0);
    }

    private static void printStringRepeatedly(String str, int count) {
        // Написать метод, которому в качестве аргументов передается строка и число, метод должен
        // отпечатать в консоль указанную строку, указанное количество раз;
        for (int i = 1; i <= count; i++) {
            System.out.println(str);
        }
    }
    private static boolean checkYear(int year) {
        // Написать метод, который определяет, является ли год високосным, и возвращает boolean
        // (високосный - true, не високосный - false). Каждый 4-й год является високосным,
        // кроме каждого 100-го, при этом каждый 400-й – високосный.

        // високосный год: обычный год и столетие
      return  (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ;


    }
}


