package com.company.lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("full_name_1","position_1", "email_1","1",
                14,1000);
        employeesArray[1] = new Employee("full_name_2","position_2", "email_2","2",
                22,2000);
        employeesArray[2] = new Employee("full_name_3","position_3", "email_3","3",
                33,3000);
        employeesArray[3] = new Employee("full_name_4","position_4", "email_4","4",
                44,4000);
        employeesArray[4] = new Employee("full_name_5","position_5", "email_5","5",
                55,5000);

        for (Employee employee : employeesArray) {
            if (employee.getAge() >40){
                employee.showInfo();
                System.out.println();
            }
        }
    }
}
