package java1.homework5;

public class Worker {
    // ФИО, должность, email, телефон, зарплата, возраст.
   public String fio;
   public String position;
   public String email;
   public String  phone;
   public int grade;
   public int age;

    public Worker (String fio, String position, String email, String phone, int grade, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.grade = grade;
        this.age = age;

    }


    public void  info() {
       System.out.println("-------------------------------");
       System.out.println("ФИО: "+ fio);
       System.out.println("Должность: "+ position);
       System.out.println("email: "+ email);
       System.out.println("Телефон: "+ phone);
       System.out.println("Зарплата: "+ grade);
       System.out.println("Возраст: "+ age);
       System.out.println("-------------------------------");
    }

}
