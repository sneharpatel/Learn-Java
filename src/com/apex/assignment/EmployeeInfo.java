//7. Create a class Employee.java with attributes empNo, empName, address, State, zipCode, phone,
// designation (manager, lead, analyst) , experienceinYears, emailAddress, basic, hra, bonus (% of basic).
// Choose appropriate data types and create a constructer, getters & setters for the attributes.
// Also create a method to return the total salary (basic + hra + (bonus/100)*basic)

package com.apex.assignment;

/**
 * Created by sneha on 2/28/19.
 */
public class EmployeeInfo {

    private String empName, address, state, zipcode, phone, emailAddress, desiganation;
    private int empNo, experienceInYears;
    private float basic, hra, bonus;

    public EmployeeInfo(int empNo, String empName) {
        this.empName = empName;
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public String getAddress() {
        String firstLine = "xyz";
        String lastLine = "Fremont";
        address = (firstLine +", "+ lastLine);
        return address;
    }


    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getDesiganation() {
        return desiganation;
    }

    public int getEmpNo() {
        return empNo;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public double getBasic() {
        return basic;
    }

    public double getHra() {
        return hra;
    }

    public double getBonus() {
        return bonus;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBasic(float basic) {
        this.basic = basic;
    }

    public void setHra(float hra) {
        this.hra = hra;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float totalSalary(){

        float bonus_value =  ((bonus/100)*basic) ;
        float total = (basic + hra + bonus_value);
        return total;
    }

    public void display(){
        System.out.println("Employee no: " + empNo);
        System.out.println("Employee name: "+ empName);
        System.out.println("Employee address: " + getAddress());
    }
}
