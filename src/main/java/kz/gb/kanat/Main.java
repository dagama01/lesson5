package kz.gb.kanat;

public class Main {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        empArray[1] = new Employee("Sagynat Dias", "Engineer", "dias@mailbox.com", "87074568312", 30000, 41);
        empArray[2] = new Employee("Zhaksylyk Alihan", "Engineer", "ivivan@mailbox.com", "87772124567", 30000, 50);
        empArray[3] = new Employee("Baibatyr Kanat", "IT", "kanat@mailbox.com", "87073149269", 30000, 20);
        empArray[4] = new Employee("Petrosyan Petrov", "Engineer", "ivivan@mailbox.com", "87089994455", 30000, 44);

        for (int i=0; i<empArray.length; i++){
            if (empArray[i].age > 40 ){
                System.out.println(empArray[i].fullName);
            }
        }
    }
}
