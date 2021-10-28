package java1.homework7;

public class Cat {
    private final  String  name;
    private final int appetite;
    private boolean satiation;  //сытость
    public static final int MAX_APPETITE = 5;
    public static final int COUNT_CAT = 5;

    public Cat(String name, int appetite, boolean satiation) {
        this.name = name;
        this.appetite = appetite;
        this.satiation = satiation;
    }

    public String getName(){
        return name;
    }


    public int getAppetite(){
        return appetite;
    }



    private void  isSatiation(boolean isCatSatiation) {
        this.satiation = isCatSatiation ;
    }


    public void eat(Plate plate){

        if (plate.getFood() >= getAppetite()) {

            plate.descreaseFood(appetite); //кота покормили, уменьшаем количества еды в тарелке

            isSatiation(true);      //кот сытый, проставим ему отметку о сытости

            System.out.println(getName() + " поел(а) " + appetite +", еды хватило.");
        } else {
            plate.emptyPlateFood(); // в тарелке мало еды, необходимо пополнить запасы
            }
    }

    public void printInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiation=" + satiation +
                '}';
    }
}
