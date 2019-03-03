//Create a class Employee.java with attributes empNo, empName, address, State, zipCode, phone,
// designation (manager, lead, analyst) , experienceinYears, emailAddress, basic, hra, bonus (% of basic).
// Choose appropriate data types and create a constructer, getters & setters for the attributes.
// Also create a method to return the total salary (basic + hra + (bonus/100)*basic)

package com.apex.assignment;

/**
 * Created by sneha on 2/28/19.
 */
public class Employee {
    public static void main(String[] args){
        EmployeeInfo employeeInfo = new EmployeeInfo(1, "abc");
        employeeInfo.display();

        employeeInfo.setPhone("987-654-4321");
        System.out.println("Employee phone number :"+employeeInfo.getPhone());

        employeeInfo.setBasic(100000);
        employeeInfo.setBonus(20000);
        employeeInfo.setHra(1000);
        float salary = employeeInfo.totalSalary();
        String strDouble = String.format("%.2f", salary);
        System.out.println("Employee total salary is :" + strDouble);


    }
}


