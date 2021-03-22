package com.kuznetsov.hw1.employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(int percent) {
        salary = (int) (salary*(1 + percent/100.0));
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ']';
    }
}

