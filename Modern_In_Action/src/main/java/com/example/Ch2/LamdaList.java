/**
 * Copyright NEWLINK Corp. All rights reserved.
 * <p>
 * NEWLINK Coin Exchange
 */
package com.example.Ch2;

import com.example.model.Apple;
import com.example.model.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * GreenAppleFilter.java
 *
 * @author Jaeyun Jeong
 */
public class LamdaList {
    public static void main(String[] args) {
       // List<Apple> redApples = filter(inven)
    }

    public static List<Apple> filterGrreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(Color.GREEN == apple.getColor()){
                result.add(apple);
            }
        }
        return result;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<>();
        for(T e : list){
            if(predicate.test(e)){
                result.add(e);
            }
        }
        return result;
    }
}
