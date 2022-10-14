/**
 * Copyright NEWLINK Corp. All rights reserved.
 * <p>
 * NEWLINK Coin Exchange
 */
package com.example.Ch2;

import com.example.model.Apple;
import com.example.model.Color;

/**
 * AppleGreenColorPredicate.java
 *
 * @author Jaeyun Jeong
 */
public class HeavyaAppleWeightPredicate implements ApplePrintPredicate{
    @Override
    public String test(Apple apple) {return apple.getWeight() > 100 ? "무거움" : "가벼움";}
}
