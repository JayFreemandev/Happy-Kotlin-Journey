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
        System.out.println(filterGrreenApples(inventory, (Apple apple) -> Color.RED == apple.getColor()));
    }

/*    public static List<Apple> filterGrreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(Color.GREEN == apple.getColor()){
                result.add(apple);
            }
        }
        return result;
    }*/

/*    public static List<Apple> filterGrreenApples(List<Apple> inventory, Color color){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(apple.getColor() == color){
                result.add(apple);
            }
        }
        return result;
    }*/

/*    public static List<Apple> filterGrreenApples(List<Apple> inventory, ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }*/

    public static List<Apple> filterGrreenApples(List<Apple> inventory, ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
