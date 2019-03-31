package com.company.epam.homework07;

/**
 * Created by vlad on 31.03.19.
 */
public class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape " +
                "class='" + getClass() + '\'' +
                "color='" + color + '\'';
    }

    public double calcArea() {
        return 0.0;
    }
}
