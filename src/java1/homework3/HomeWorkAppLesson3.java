package java1.homework3;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkAppLesson3 {
    public static void main(String[] args) {
         arrayChangeNumber();
         fillTheArray(100);
         arrayMultiplication();
         changeArrayTwoDemensionSquare(10);
         printArray(changeArrayResult(10,8));
         findMinMaxElementOfArray();

         int[] array  = {2, 2, 2, 1, 2, 2, 10, 1};
         System.out.println(isEqualSumLeftRightOfPartsArray(array));
         printArray(array);


    }

    private static boolean isEqualSumLeftRightOfPartsArray(int [] arr) {

        System.out.println("7. ** Написать метод, в который передается не пустой одномерный целочисленный " +
                        "массив, метод должен вернуть true, если в массиве есть место, в котором сумма " +
                        "левой и правой части массива равны.");
        //**Примеры:
        //checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
        //checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
        //граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

        int[] array = {2, 2, 2, 1, 2, 2, 10, 1};

        int sumLeft = 0;
        int sumRight  = 0;
        boolean bool = false;

            for (int i = 0; i < arr.length - 1; i++) {
                sumLeft += array[i];

                for (int j = i + 1; j < array.length; j++) {
                    sumRight += arr[j];
                }

                if (sumLeft == sumRight) {
                    bool = true;
                    System.out.println("sumLeft = " + sumLeft + " sumRight = "+ sumRight);
                }
                sumRight = 0;
            }
            return bool;
    }

    private static void findMinMaxElementOfArray() {

        System.out.println("6. * Задать одномерный массив и найти в нем минимальный " +
                "и максимальный элементы ;");
        int[] array = { 56, 5, 3, 2, 118, 4, 5, 2, 4, 8120, 9, 1};
        int numberMin = 0;
        int numberMax = 0;
        for (int i = 0; i < array.length; i++){

            int number = array[i];

            if (numberMin > number  || i == 0) {
                numberMin = number;
            }
            if (numberMax < number || i == 0) {
                numberMax = number;
            }

        }
        printArray(array);

        System.out.println("numberMin = " +numberMin);
        System.out.println("numberMax = " +numberMax);


    }

    private static void printArray(int [] arr) {

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static int [] changeArrayResult(int len, int initialValue) {
        System.out.println("5. Написать метод, принимающий на вход два аргумента: len и initialValue, " +
                "и возвращающий одномерный массив типа int длиной len, каждая ячейка которого " +
                "равна initialValue;");
        int[] array = new int[len];

        // заполняем массив
        Arrays.fill(array, initialValue);

        return array;
    }

    private static void changeArrayTwoDemensionSquare(int size) {
        System.out.println("4. Создать квадратный двумерный целочисленный массив (количество строк и " +
                "столбцов одинаковое) , и с помощью цикла(-ов) заполнить его " +
                "диагональные элементы единицами (можно только одну из диагоналей, если " +
                "обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: " +
                "индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];");

        int[][] arrayToDemensional = new int[size][size];

        // заполняем нулями массив
        for (int i = 0; i < arrayToDemensional.length; i++) {
            for (int j = 0; j < arrayToDemensional.length; j++) {
                arrayToDemensional[i][j] = 0;
            }
        }

        System.out.println("Change array: ");
        int countI = 0;
        for (int i = 0; i < arrayToDemensional.length; i++) {
            countI++;
            for (int j = 0; j < arrayToDemensional.length; j++) {
                if (i == j || arrayToDemensional.length == countI + j) {
                    arrayToDemensional[i][j] = 1;
                }
                System.out.print(arrayToDemensional[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void arrayMultiplication() {
        System.out.println();
        System.out.println("3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]" +
                        " пройти по нему циклом, и числа меньшие 6 умножить на 2;");
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("Array origin: ");

        printArray(array);

        System.out.print("Change array: ");

        for (int i = 0; i < array.length; i++){
            if (array[i] < 6) {
                array[i] = array[i]*6;
            }
        }

        printArray(array);
    }
    private static void arrayChangeNumber() {
        System.out.println("1. Задать целочисленный массив, состоящий из элементов 0 и 1. "
                + "Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и "
                + "условия заменить 0 на 1, 1 на 0;");

        // задаем массив
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        // Исходный массив
        System.out.print("Origin array: ");
        printArray(array);

        // заменить 0 на 1, 1 на 0;
        for (int i = 0;  i < array.length; i++) {

            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i]= 0;
            }
        }
        // Массив с измененными значениями
        System.out.print("Change array: ");
        printArray(array);
    }

    private static void fillTheArray(int size) {

        System.out.println("2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить"
        + "его значениями 1 2 3 4 5 6 7 8 … 100;");

        System.out.println("Заполняем массив 0 до size: ");

        int[] arrayNumber = new int[size];

        for (int i = 0;  i < arrayNumber.length; i++) {
            arrayNumber[i] = i;
            System.out.print(arrayNumber[i] + " ");
        }
    }



}