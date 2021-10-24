package java1.homework5;

import java.util.Random;

public class Worker {
   private String fio;
   private String position;
   private String email;
   private String phone;
   private int grade;
   private int age;

   public Worker(String fio, String position, String email, String phone, int grade, int age){
       this.fio = fio;
       this.position = position;
       this.email = email;
       this.phone = phone;
       this.grade = grade;
       this.age = age;
   }

   public String setFio() {
       return fio;
   }

    public String setPosition() {
        return position;
    }
    public String setEmail() {
        return email;
    }
    public String setPhone(String s) {
        return phone;
    }

    public int setGrade() {
        return grade;
    }

    public int setAge(Random random) {
        return  age;
    }


   public int getAge() {
       return age;
   }

    public void  printInfo() {
       System.out.println(this);
    }

    @Override
    public String  toString() {
       return "Worker{" +
               "ФИО:'" + fio + '\'' +
               ", Должность:'" + position + '\'' +
               ", email: '"+ email + '\'' +
               ", Телефон: '"+ phone + '\'' +
               ", Зарплата: '"+ grade + '\'' +
               ", Возраст: '"+ age + '\'' +
                '}';

    }

}
