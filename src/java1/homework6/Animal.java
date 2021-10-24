package java1.homework6;

public class Animal {
    protected final String name;
    protected final String color;
    protected final int age;
    protected final int enduranceRun; //выносливость для бега
    protected final int enduranceSwim; //выносливость для плаванья
    protected final int enduranceJump; //выносливость для прыжков

    public Animal(String name, String color, int age, int enduranceRun, int enduranceSwim, int enduranceJump){
        this.name = name;
        this.color = color;
        this.age = age;
        this.enduranceRun = enduranceRun;
        this.enduranceSwim = enduranceSwim;
        this.enduranceJump = enduranceJump;
    }

    public String getName() {
        return name;
    }

    public boolean jump(int countJump){
        System.out.println("Animal может прыгать!");
        return true;
    }

    public boolean run(int countRun){
        System.out.println("Animal может бежать!");
        return true;
    }

    public boolean  swim(int countSwim){
        System.out.println("Animal может плавать!");
        return true;
    }

    public void printInfo(){
        System.out.println(this.toString());
    }

}