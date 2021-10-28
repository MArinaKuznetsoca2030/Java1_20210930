package java1.homework7;

import java.util.Scanner;

public class Plate {

    public static Scanner scanner =  new Scanner(System.in);
    public static final int PLATE_MIN_FOOD = 1;
    public static final int PLATE_MAX_FOOD = 10;

    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public int getFood(){
        return  food;

    }


    public void info(){
        System.out.println("В тарелке осталось: "+food +" единицы еды.");
    }

    public void descreaseFood(int foodCount){
        //обновление еды
        this.food -= foodCount;

    }

    public void emptyPlateFood(){

        int enterFood = 0;
        System.out.println("В тарелке не достаточно еды, необходимо обновить запасы!");

        do {
            System.out.println("Значение еды должно быть положительным числом от " +PLATE_MIN_FOOD +" до "
                    + PLATE_MAX_FOOD + " включительно. ");
            enterFood = scanner.nextInt();

        } while (enterFood < PLATE_MIN_FOOD || enterFood > PLATE_MAX_FOOD );

        this.food += enterFood;

    }


}
