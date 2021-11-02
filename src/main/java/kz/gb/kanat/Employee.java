package kz.gb.kanat;

public class Employee {
    String fullName;
    String position;
    String email;
    String number;
    int salary;
    int age;


    Employee(String fullName, String position, String email, String number, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
    void print(){
        System.out.printf("Сотрудник c ФИО %s, должностью %d, email: %d, salary: %s, age: %d");
    }
}
