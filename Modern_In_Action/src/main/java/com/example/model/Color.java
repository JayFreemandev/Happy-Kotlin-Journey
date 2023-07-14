/**
 * Copyright NEWLINK Corp. All rights reserved.
 * <p>
 * NEWLINK Coin Exchange
 */
package com.example.model;

/**
 * Color.java
 *
 * @author Jaeyun Jeong
 */
public enum Color {
    RED("RED", "빨간맛"),
    GREEN("GREEN", "초록초록");

    private String color;
    private String name;

    Color(String color, String name) {
        this.color = color;
        this.name = name;
    }
}
