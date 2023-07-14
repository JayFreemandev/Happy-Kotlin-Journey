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
        inventory.add(new Apple(45));
        inventory.add(new Apple(160));
        System.out.println(prettyPrintApple(inventory, new HeavyaAppleWeightPredicate()));
    }

    public static List<Apple> prettyPrintApple(List<Apple> inventory, ApplePrintPredicate applePrintPredicate){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            String output = applePrintPredicate.test(apple);
            System.out.println(output);
        }
        return result;
    }
}
