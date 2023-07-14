package com.example.etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created at 2022-12-20
 * Site ->
 * Link ->
 * Level ->
 * Topic ->
 */
public class CompareTest {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Designer", "Joy", 60000));
        list.add(new Employee("Server", "James", 150000));
        list.add(new Employee("Android", "Steve", 80000));

        System.out.println("연봉기준 오름차순 정렬");
        Collections.sort(list);

        for(Employee e : list) {
            System.out.println(e);
        }
    }
}
