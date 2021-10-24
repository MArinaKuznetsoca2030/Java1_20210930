package java1.homework6;


public class Dog extends Animal{

    public static final int DOC_RUN = 500;
    public static final int DOC_SWIM = 10;
    public static final int DOC_JUMP = 5;

    public Dog(String name, String color, int age, int enduranceRun, int enduranceSwim, int enduranceJump){
        super(name, color, age, enduranceRun, enduranceSwim, enduranceJump);
    }

    @Override
    public boolean run(int countRun){
        boolean result;
        result = countRun <= this.enduranceRun;

        System.out.println(name + " может пробежать максимум " + this.enduranceRun + "м. " + name+ " пробежал(а): " + countRun + "м.   result:" + result);
        return result;
    }


    @Override
    public boolean swim(int countSwim){
        boolean result;
        result = countSwim <= this.enduranceSwim;

        System.out.println(name + " может проплыть максимум " + this.enduranceSwim + "м. " + name+ " проплыл(а): " + countSwim + "м.   result:" + result);
        return result;
    }

    @Override
    public boolean jump(int countJump){
        boolean result;
        result = countJump <= this.enduranceJump;

        System.out.println(name + " может перепрыгнуть максимум " + this.enduranceJump + "м. " + name+ " перепрыгнул(а): " + countJump + "м.   result:" + result);
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