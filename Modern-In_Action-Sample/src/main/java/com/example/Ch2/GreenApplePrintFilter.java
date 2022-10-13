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
 * GreenApplePrintFilter.java
 *
 * @author Jaeyun Jeong
 */
public class GreenApplePrintFilter {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(Color.GREEN));
        System.out.println(prettyPrintApple(inventory, new AppleGreenColorPredicate()));
    }

    public static List<Apple> prettyPrintApple(List<Apple> inventory, ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
