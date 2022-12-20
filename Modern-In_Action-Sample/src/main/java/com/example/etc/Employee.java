package com.example.etc;

import lombok.Getter;
import lombok.Setter;

/**
 * Created at 2022-12-20
 * Site ->
 * Link ->
 * Level ->
 * Topic ->
 */
@Getter
@Setter
public class Employee implements Comparable<Employee>{
    private String position;
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(String position, String name, int salary) {
        this.position = position;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return salary - o.getSalary();
    }
}
