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
public class GreenAppleFilter {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(Color.GREEN));
        System.out.println(filterGrreenApples(inventory));
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
}
