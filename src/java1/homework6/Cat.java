package java1.homework6;

public class Cat extends  Animal{

    public static final int CAT_RUN = 200;
    public static final int CAT_SWIM = 2;
    public static final int CAT_JUMP = 1;

    public Cat(String name, String color, int age, int enduranceRun, int enduranceSwim, int enduranceJump){
        super(name, color, age, enduranceRun, enduranceSwim, enduranceJump);
    }

    @Override
    public boolean run(int countRun){
        boolean result;
        result = this.enduranceRun >= countRun;

        System.out.println(name + " может пробежать максимум " + this.enduranceRun + "м. " + name+ " пробежал(а): " + countRun + "м.   result: " + result);
        return result;

    }
    @Override
    public boolean swim(int countSwim){
        boolean result = false;
        System.out.println("Кот НЕ может плавать!");
        return result;
    }

    @Override
    public boolean jump(int countJump){
        boolean result;
        result = countJump <= this.enduranceJump;

        System.out.println(name + " может перепрыгнуть максимум " + this.enduranceJump + "м. " + name+ " перепрыгнул(а): " + countJump + "м. result:" + result);
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +'\'' +
                ", enduranceRun=" + enduranceRun +'\'' +
                ", enduranceSwim=" + enduranceSwim +'\'' +
                ", enduranceJump=" + enduranceJump +'\'' +
                '}';
    }


}
