/**
 * Copyright NEWLINK Corp. All rights reserved.
 * <p>
 * NEWLINK Coin Exchange
 */
package com.example.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Apple.java
 *
 * @author Jaeyun Jeong
 */
@Getter
@Setter
public class Apple {
    private Color color;
    private int weight;

    public Apple(Color color) {
        this.color = color;
    }

    public Apple(int weight) {
        this.weight = weight;
    }
}
