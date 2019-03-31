package com.company.epam.homework07;

import java.util.Arrays;
import java.util.Random;

public class Main {

    final static int RANDOM_NUMBER = 10;
    public static Shape[] shape = new Shape[9];

    public static void main(String[] args) {
        makeShapes();
        showShapes(shape);

        System.out.println("\n" + areaSum(shape));
        System.out.println("\n" + Arrays.toString(differentArea(shape)));

//        areaSum(shape);
//        differentArea(shape);
    }

    public static void makeShapes() {
        String[] color = {"blue", "red", "violet", "black", "green", "yellow"};
        Random random = new Random();

        for(int i=0; i<3; i++)
        {
            int pos = random.nextInt(color.length);
            Circle circle = new Circle(color[pos], random.nextInt(RANDOM_NUMBER));
            shape[i] = circle;
        }

        for(int i=3; i<7; i++)
        {
            int pos = random.nextInt(color.length);
            Rectangle rectangle = new Rectangle(color[pos], random.nextInt(RANDOM_NUMBER), random.nextInt(RANDOM_NUMBER));
            shape[i] = rectangle;
        }

        for(int i=7; i<9; i++)
        {
            int pos = random.nextInt(color.length);
            Triangle triangle = new Triangle(color[pos],
                    random.nextInt(RANDOM_NUMBER),
                    random.nextInt(RANDOM_NUMBER),
                    random.nextInt(RANDOM_NUMBER));
            shape[i] = triangle;
        }
        System.out.println("Completed");
    }

    public static void showShapes (Shape[] shape) {
        for (Shape row : shape) {
            System.out.println(row.toString());
        }
    }

    public static double areaSum(Shape[] shape) {
        double sum = 0.0;
        for (Shape row : shape) {
            sum += row.calcArea();
        }
        return sum;
    }

    public static double[] differentArea(Shape[] shape) {
        double triangleArea = 0.0;
        double circleArea = 0.0;
        double rectangleArea = 0.0;
        for (Shape row : shape) {
            if (row instanceof Rectangle) {
                rectangleArea += row.calcArea();
            } else if (row instanceof Triangle) {
                triangleArea += row.calcArea();
            } else {
                circleArea += row.calcArea();
            }
        }
        return new double[] {rectangleArea, circleArea, triangleArea};
    }
}
