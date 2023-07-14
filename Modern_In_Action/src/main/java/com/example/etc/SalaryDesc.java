package com.example.etc;

import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

/**
 * Created at 2022-12-20
 * Site ->
 * Link ->
 * Level ->
 * Topic ->
 */
@Getter
@Setter
public class SalaryDesc implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        // Salary Descending
        return employee1.compareTo(employee2) * -1;
    }
}
